let mydetails ={
    name: "AIshwarya",
    Age: "23",
    surname:"shirke",
    
}
let Address=function(state,country){
    pincode:"416312"
    //console.log(this.name+state+" "+country);
    console.log(this.name +" "+ state +" "+ country);
}



let mydetails2 ={
    name:"somesh",
    Age:"32",
    surname:'sahu',
}
let mydetails3 ={
    name:"Unknown",
    Age:"34",
    surname:'United',
}
//console.log(Address());
Address.call(mydetails,"Bengaluru","India");
Address.apply(mydetails2,["Hyderabad","India"]);
let bindfunc = Address.bind(mydetails3);
//console.log(bindfunc);
bindfunc();