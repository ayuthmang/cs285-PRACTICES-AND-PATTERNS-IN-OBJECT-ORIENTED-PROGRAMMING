import Flight from "./Flight";

export default abstract class FlightInsurance implements Flight {
  protected baseFlight: Flight;

  constructor(baseFlight: Flight) {
    this.baseFlight = baseFlight;
  }

  getName(): string {
    return this.baseFlight.getName();
  }

  getPrice(): number {
    return this.baseFlight.getPrice();
  }
}
