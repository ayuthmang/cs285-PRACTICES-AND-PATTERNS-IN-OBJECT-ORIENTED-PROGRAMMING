import Flight from "./Flight";
import FlightInsurance from "./FlightInsurance";

export default class StuffInsurance extends FlightInsurance {
  constructor(baseFlight: Flight) {
    super(baseFlight);
  }

  getName(): string {
    return "StuffInsurance";
  }

  getPrice(): number {
    return super.getPrice() + 200.0;
  }
}
