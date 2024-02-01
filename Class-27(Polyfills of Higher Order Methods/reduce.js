let num = [1,2,3,4]
//  let sum = num.reduce(function(acc,curr){
//     return acc+curr;
//  },0)
//  console.log(sum);

Array.prototype.myReduce = function(cb,initialValue){
    let accumulator = initialValue;
    for(let i=0;i<this.length;i++){
        accumulator = cb(this[i],accumulator)
    }
    return accumulator;
}
function cb(num,acc){
    return num+acc;
}
let sum = num.myReduce(cb,0);
console.log(sum);