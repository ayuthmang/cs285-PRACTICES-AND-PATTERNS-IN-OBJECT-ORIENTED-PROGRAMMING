import Debug from "debug";
import express from "express";

import FlightFactory from "../controllers/FlightFactory";
import { getFlights, getFlightsById } from "../utils";
import Flight from "../controllers/Flight";

const debug = Debug("app:api");
const router = express.Router();

/* GET users listing. */
router.get("/", function(req, res, next) {
  res.send("It's works.");
});

router.get("/flights", async function(req, res, next) {
  try {
    const response = await getFlights();
    debug(response);
    res.send(response.data);
  } catch (error) {
    console.error(error);
  }
});

router.get("/flights/:id", async function(req, res, next) {
  const { id } = req.params;
  try {
    const result = await getFlightsById(id);
    res.send(result);
  } catch (error) {
    console.error(error);
  }
});

router.post("/flights/:id/checkout", async function(req, res, next) {
  const { id } = req.params;
  const {
    firstName,
    lastName,
    insurance,
    title,
    passportNo,
    country,
    birthDay,
    birthMonth,
    birthYear,
    expDay,
    expMonth,
    expYear
  } = req.body;
  const birthDate = new Date(birthDay, birthMonth, birthYear);
  const expDate = new Date(expYear, expMonth, expDay);

  let flightData = await getFlightsById(id);
  if (flightData.length <= 0) {
    res.send({
      status: false,
      error: {
        message: "Flight id not found"
      }
    });
  }
  flightData = flightData[0];
  const { price } = flightData;
  debug(price);
  debug(flightData);

  let flightType = "";
  if (insurance.life && insurance.stuff)
    flightType = "LIFE_AND_STUFF_INSURANCE";
  else if (insurance.life && !insurance.stuff) flightType = "LIFE_INSURANCE";
  else if (!insurance.life && insurance.stuff) flightType = "STUFF_INSURANCE";
  debug("flightType:", flightType);

  const flightFactory = new FlightFactory();
  const aFlight = flightFactory.createFlight({ flightType, price });

  debug(aFlight.getPrice());
  let response = {
    firstName,
    lastName,
    price: aFlight.getPrice(),
    title,
    passportNo,
    country,
    birthDate,
    expDate
  };
  res.send(response);
});

export default router;
