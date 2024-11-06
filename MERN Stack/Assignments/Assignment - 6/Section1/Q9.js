function sum(...nums) {
    return nums.reduce((total, n) => total + n, 0);
}

console.log(sum(1,2,3,4,5,6,7,8,9));
