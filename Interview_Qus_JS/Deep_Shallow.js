//shallow copy -using destructing ...obj we can copy the value of object to user object as a name 


// let obj ={
//     name : "Aishwarya",
//     address: {
//         city:"Tasgaon",
//         state :"Maharashtra"
//     }
// };

// //let user = {...obj};//1st way destructing wer can copy the values from ob to user 
// let user = Object.assign({},obj)//2nd way by method
// user.address.city = "bhilai";
// console.log(obj.address.city);//but here the nested object will not get copied so this problem we can solve usiing deep copy
// console.log(user.address.city);



//Deep copy--the same eg will take so tp copy the nested object into another object we have to convert first
// object to string and the string to object so using this we can copy the nsted objects to the other object

let obj ={
    name : "Aishwarya",
    address: {
        city:"Tasgaon",
        state :"Maharashtra"
    },
    getData:function(){
        return("All data is here");
    }
};
let user = JSON.parse(JSON.stringify(obj));//using this by converting object to string and string to object we can copy nested values to other 
//but there is a limitation of deep copy that we cannot copy functions so to resolve this we canm use lodash React library 
user.address.city = "bhilai" ;
console.log(obj);



user = _.cloneDeep(obj);
console.log(user);

user.address.state ="Chattisgarh";



