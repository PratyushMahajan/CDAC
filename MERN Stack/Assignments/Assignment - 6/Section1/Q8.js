const items = [{price: 100}, {price: 200}, {price: 300}];

const totalPrice = items.reduce((sum, item) => sum + item.price, 0);

console.log(totalPrice);