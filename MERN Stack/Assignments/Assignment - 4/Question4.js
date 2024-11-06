const fetchData = (url, callback) => {
    console.log(`Fetching data from ${url}...`);
    setTimeout(() => {
        const isError = Math.random() > 0.5;
        isError ? callback("Network error: Failed to fetch data", null) : callback(null, `Response from ${url}`);
    }, 2000);
};

fetchData("https://x.com", (error, response) => {
    error ? console.error(`Error: ${error}`) : console.log(response);
});
