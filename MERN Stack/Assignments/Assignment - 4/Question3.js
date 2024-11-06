const fetchData = (url, callback) => {
    console.log(`Fetching data from ${url}...`);

    setTimeout(() => {
        const response = `Response from ${url}`;
        callback(response); 
    }, 2000); 
};

fetchData("https://x.com", response => {
    console.log(response); 
});
