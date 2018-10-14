const urls = {
  getFlights: 'https://api.myjson.com/bins/120nec'
};

const getFlights = () =>
  axios
    .get(urls.getFlights)
    .then(res => res.data)
    .then(res => res);
