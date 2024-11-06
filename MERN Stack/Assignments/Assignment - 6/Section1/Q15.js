function operations(nums) {
    return nums.filter(num => num % 2 == 0)
               .map(num => num * 2)
               .reduce((total, num) => total + num, 0);
}

console.log(operations([1,2,3,4,5,6,7,8,9]));