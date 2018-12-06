import axios from "axios";

export const getFlights = () => {
  return axios.get("https://api.myjson.com/bins/h3w0u");
};

export const getFlightsById = async id => {
  try {
    const response = await getFlights();
    const result = response.data.filter(flight => flight.id == id);
    return result;
  } catch (error) {
    console.error(error);
  }
};
