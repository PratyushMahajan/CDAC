const fetchData = (url, callback) => {
    console.log(`Fetching data from ${url}...`);
    setTimeout(() => {
        const isError = Math.random() > 0.5;
        isError ? callback("Network error: Failed to fetch data", null) : callback(null, `Response from ${url}`);
    }, 2000);
};

const processData = (data, callback) => {
    console.log("Processing data...");
    setTimeout(() => {
        const processedData = `${data} - Processed`;
        callback(processedData);
    }, 1000);
};

fetchData("https://x.com", (error, response) => {
    if (error) {
        console.error(`Error: ${error}`);
    } else {
        processData(response, processedResult => {
            console.log(processedResult);
        });
    }
});
