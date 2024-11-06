const processData = (inputString, callback) => {
    const result = callback(inputString);
    console.log(result);
};

const toUpperCase = string => string.toUpperCase();

processData("Pratyush Mahajan", toUpperCase);
