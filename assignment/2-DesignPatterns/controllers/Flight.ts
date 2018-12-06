export default abstract class Flight {
  private name: String;
  private detail: String;
  private isDirect: Boolean;
  private price: Number;

  constructor(name: String, detail: String, isDirect: Boolean, price: Number) {
    this.name = name;
    this.detail = detail;
    this.isDirect = isDirect;
    this.price = price;
  }

  getPrice(): Number {
    return this.price;
  }
}
