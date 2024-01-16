let details = {
    name:"AIshwarya",
    age:23,
    height:6.1,
    friends:['nidhi','nadim','somesh'],
    address:{
        country:"INDIA",
        city:{
            name:"Banglore",
            pincode:415312,
        }
    }
}
//console.log(details);
//console.log(details.height);
//console.log(details['name']);
delete details.age
//console.log(details);
details.age= 32
details.name = "somesh";
console.log(details.name)
