import Flight from "./Flight";
import { thisTypeAnnotation } from "babel-types";

export default class BaseFlight implements Flight {
  // name: string;
  // detail: string;
  // isDirect: boolean;
  // price: number;

  constructor({ price }) {
    // this.name = name;
    // this.detail = detail;
    // this.isDirect = isDirect;
    (this as any).price = price;
  }

  // getName(): string {
  //   return this.name;
  // }

  // getPrice(): number {
  //   return this.price;
  // }

  getName(): string {
    return "BaseFlight";
  }

  getPrice(): number {
    let price = (this as any).price * 1.07
    return parseFloat(price.toFixed(2));
  }
}
