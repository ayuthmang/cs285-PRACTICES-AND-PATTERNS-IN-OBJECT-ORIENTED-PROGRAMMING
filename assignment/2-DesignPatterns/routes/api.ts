import axios from "axios";
import Debug from "debug";
import express from "express";

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
    const response = await getFlights();
    const result = response.data.filter(flight => flight.id == id);
    res.send(result);
  } catch (error) {
    console.error(error);
  }
});

const getFlights = () => {
  return axios.get("https://api.myjson.com/bins/h3w0u");
};

export default router;
