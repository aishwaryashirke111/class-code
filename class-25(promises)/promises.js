let mypromise = new Promise(function(resolve,reject){
    let a = 4;
    let b= 5;
    if(a==b){
        resolve("This is resolved");
    }else{
        reject("This is rejected");
    }
})

mypromise.then(function(data){
    console.log(data);
})
mypromise.catch(function(err){
confirm.log(err);
})