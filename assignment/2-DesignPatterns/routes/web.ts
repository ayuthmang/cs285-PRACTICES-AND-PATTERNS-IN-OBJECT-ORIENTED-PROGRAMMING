import express from "express";
import Debug from "debug";

import url from "../utils/url";
import { getFlightsById } from "../utils";

const debug = Debug("app:web");
const path = require("path");
const router = express.Router();

/* GET home page. */
router.get("/", function(req, res, next) {
  res.render("index", { title: "Flights" });
});

router.get("/displayFlights", function(req, res, next) {
  // res.render("listFlights", { title: "List Flights" });
  // res.sendFile(path.join(__dirname, "../", "public/", "displayFlights.html"));
  res.render("displayFlights", {
    baseUrl: url.baseUrl
  });
});

router.get("/information/:id", async function(req, res, next) {
  const { id } = req.params;
  debug(id);
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

  res.render("information", {
    baseUrl: url.baseUrl,
    flightData
  });
  // res.sendFile(path.join(__dirname, "../", "public/", "information.html"));
});

export default router;
