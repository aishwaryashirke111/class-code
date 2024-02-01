let arr = [1,2,3,4,5]
Array.prototype.myFilter = function(){
    let result = []
    for(let i=0;i<this.length;i++){
        if(cb(this[i])){
            result.push(this[i])
        }
    }
    return result;
}
function cb(arr){
    return arr%2==0;
}
let final = arr.myFilter(cb);
console.log(final);