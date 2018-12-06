import express from "express";

const router = express.Router();

/* GET home page. */
router.get("/", function(req, res, next) {
  res.render("index", { title: "Express" });
});

router.get("/flights", function(req, res, next) {
  res.render("flights", { title: "The Flights" });
});

export default router;
