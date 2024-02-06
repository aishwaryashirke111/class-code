const fs = require("fs");

// fs.readFile("f1.txt",(err,data1) =>{
//     if(err){
//         console.log(err);
//         return;
//     }
//     console.log(`This is a data from ${data1}`);

// })
let myPromise = fs.promises.readFile("f2.txt");
myPromise.then(function(data){
    console.log(data)
})
myPromise.catch(function(err){
    console.log(err);
})