
//normal function
// function printfirst(first){
//     console.log(first)
// }
// function printlast(last){
//     console.log(last)
// }

// printfirst("Aishwarya");
// printlast("somesh");

//callback function
function printfirst(first,cb,cb1){
    console.log(first)
    cb("shirke")
    cb1(30)
}
function printlast(last){
    console.log(last)
}
function printAge(age){
    console.log(age)
}

printfirst("Aishwarya",printlast,printAge);
//printlast("somesh");


