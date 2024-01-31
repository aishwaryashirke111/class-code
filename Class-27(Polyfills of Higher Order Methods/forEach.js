const names= ["AIshwarya","somesh","nidhi","nadim"];

// arr.forEach(function(ele){
//     console.log(ele);
// })
const num = [1,2,3,4]

//console.log(Array.prototype);
Array.prototype.myForEach=function(callback){
    for(let i=0;i<=this.length-1;i++){
        callback(this[i]);
    }    
}
function cb(names){
    console.log(names)
}

names.myForEach(cb);