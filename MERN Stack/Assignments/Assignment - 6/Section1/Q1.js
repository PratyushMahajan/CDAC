const taxRates = 0.10;

let totalPrice = 0;

let cart = [];

function addItem(item, price) {
    cart.push(item, price);
    totalPrice += price * (1 + taxRates);
}

addItem("Grocery Basket", 200);
addItem("Shirt", 500);
addItem("Beverages", 800);

console.log("The Total Price of the Cart: " + totalPrice);