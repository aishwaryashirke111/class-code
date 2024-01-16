//sum of all  numbers

let arr = [2,3,4,5,6];

let sum = arr.reduce(function(acc,num){
    acc = acc+num
    return acc
},0)//initializing accummulator to 0 
console.log(sum);