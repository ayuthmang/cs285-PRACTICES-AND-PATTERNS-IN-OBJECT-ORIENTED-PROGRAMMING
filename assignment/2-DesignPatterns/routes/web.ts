import express from "express";

const router = express.Router();

/* GET home page. */
router.get("/", function(req, res, next) {
  res.render("index", { title: "Flights" });
});

router.get("/searchFlights", function(req, res, next) {
  res.render("searchFlights", { title: "Search Flights" });
});

router.get("/listFlights", function(req, res, next) {
  res.render("listFlights", { title: "List Flights" });
});

export default router;
