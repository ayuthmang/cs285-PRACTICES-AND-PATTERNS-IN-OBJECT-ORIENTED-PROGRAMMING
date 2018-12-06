import Flight from "./Flight";
import FlightInsurance from "./FlightInsurance";

export default class LifeInsurance extends FlightInsurance {

  constructor(baseFlight: Flight) {
    super(baseFlight);
  }

  getName(): string {
    return "LifeInsurance";
  }

  getPrice(): number {
    return super.getPrice() + 200.0;
  }
}
