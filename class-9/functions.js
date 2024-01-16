
//This is a normal function
function hi(){
    console.log('Hi');
}
hi()
//This is function with first class citizen and function with expression.
let show = function walk(){
    console.log("This is a function with expression");
}
show()

let mul = function(a,b){
    console.log(a*b);
}
mul(2,3);
//fat arrow function
let sub =(n,m) =>{
    console.log(n-m);
}
sub(10,5);