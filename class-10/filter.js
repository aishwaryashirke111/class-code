//check wheter the jumber is even or odd using filter method

let arr = [2,3,4,5,6,67,78,0];

let result = arr.filter(function(num){
    return num%2 ==0;
})
console.log(result);

let odd = arr.filter(function(num1){
    return num1%2!= 0;
})
console.log(odd);