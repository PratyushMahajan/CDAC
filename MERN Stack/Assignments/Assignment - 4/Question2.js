const forEachElement = (array, callback) => {
    array.forEach((element, index) => callback(element, index));
};

forEachElement([1,2,3,4], (element, index) => {
    console.log(`Index ${index}: ${element * 2}`);
}); 