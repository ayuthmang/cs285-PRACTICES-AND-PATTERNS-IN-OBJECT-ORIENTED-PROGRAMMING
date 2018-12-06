import Flight from "./Flight";
import BaseFlight from "./BaseFlight";
import LifeInsurance from "./LifeInsurance";
import StuffInsurance from "./StuffInsurance";

export default class FlightFactory {
  createFlight({ flightType, price }): Flight {
    let aFlight = new BaseFlight({ price });

    if (flightType === "LIFE_INSURANCE") {
      aFlight = new LifeInsurance(aFlight);
    } else if (flightType === "STUFF_INSURANCE") {
      aFlight = new StuffInsurance(aFlight);
    } else if (flightType === "LIFE_AND_STUFF_INSURANCE") {
      aFlight = new LifeInsurance(aFlight);
      aFlight = new StuffInsurance(aFlight);
    }

    return aFlight;
  }
}
