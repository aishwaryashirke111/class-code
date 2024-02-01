let num = [1,2,3,4];
// let square = num.map(function(num){
//     return(num*num);
// })
// console.log(square);

Array.prototype.myMap = function(callback){
    let resultArr = [];
    for(let i=0;i<this.length;i++){
        resultArr.push(callback(this[i]))
        
    }
    return resultArr;
}
//console.log(resultArr);
function cb(num){
    return num*num;
}

let final = num.myMap(cb);
console.log(final);