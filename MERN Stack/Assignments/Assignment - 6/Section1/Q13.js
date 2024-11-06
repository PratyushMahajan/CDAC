function outerFunction() {
    const var1 = "Outer Function";

    return function innerFunction() {
        console.log(var1);
    };
}

const inner = outerFunction();
inner();