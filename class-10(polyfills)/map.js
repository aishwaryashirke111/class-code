let arr = [2,3,4,5,6,7];
let result = arr.map(
    function square(num){
        return num*num;        
    })
console.log(result)

// I have Bank Transactions and you have to convert this from usd to inr
const transactions = [1000, 3000, 4000, 2000, - 898, 3800, - 4500];
const inrtToUsd = 80;

let convert = transactions.map(
    function moneyconvert(num){
        return num*80;
    }
)
console.log(convert);