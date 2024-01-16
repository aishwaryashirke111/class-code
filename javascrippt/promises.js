//promise has four stages
//pending -->Its not resolved also and not even rejected also this state is known as pending stage.
//fullfill-->resolve method
//Rejected-->rejcet method
//settled-->then and catch method(whatever it is resolve or rejcted its a settled promise)



let myPromise = new Promise(function(resolve,reject){
    const a = 5;
    const b = 6;
    if(a===b){
        resolve("They both are equal");// promise is fullfill
    }else{
        reject("They both are not equal");//promise is reject
    }
})
//console.log(myPromise);


// promise is setteled 
myPromise.then(function(result){
    console.log(result);
})

myPromise.catch(function(err){
    console.log(err);
})