async function fetchData() {
    try {
        const response = await fetch("https://api.nationalize.io?name=nathaniel");
        const data = await response.json();
        console.log(data);
    } 
    catch(error) {
        console.error("Error fetching data: ", error);
    }
}

fetchData();