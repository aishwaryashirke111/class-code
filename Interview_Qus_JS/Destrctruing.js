let array = ['js','php','java','python'];

[top1,top2,top3,top4] = array;
console.log(top1);

[top1,,,toplast] = array;
console.log(toplast);

//in destrcturing we can skip the values in array this is new feature in ES6

console.warn(`My fav prog lang is ${top1} and 2nd fav is ${top3}`)


//symbol-data type in jS
const mysymbol = Symbol('mysymbol',{global:true});
console.log(mysymbol)
