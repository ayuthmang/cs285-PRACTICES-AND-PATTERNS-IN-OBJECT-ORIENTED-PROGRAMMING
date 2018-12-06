import Flight from "./Flight";
import Assuarance from "./Assurance";

export default class FlightFactory {
  createFlight({ flight }) {
    let stuffAssurance: Assuarance, lifeAssurance: Assuarance;
    switch (flight) {
      case "STUFF_ASSURANCE":

        return

      case "LIFE_ASSURANCE":
        break;
    }
  }
}
