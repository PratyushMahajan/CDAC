function delayBy(callback, delayTime) {
    setTimeout(callback, delayTime);
}

delayBy( () => console.log("Hello World"), 2000);