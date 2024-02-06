let promise1 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("Promise1 Resovlved")
    },7000)
})
let promise2 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("promise2 is resolve");
    },4000)
})


// function executePromise(){// tyhis is a normal function to handle a promise
//     promise1.then((res)=>console.log(res))
//     console.log("scaler is awsome");
// }
// executePromise();

//asynch function without then 
async function Asynchfun(){
    console.log("How are you")
    let resolved = await promise1
    console.log(resolved);

    let resolved2 = await promise2
    console.log(resolved2);

    console.log("This is Asynch function ")
}
Asynchfun();
console.log("This is the end of file")
