let arr = [2,3,4,5,6]
let result = []


function calculate(arr){
    for(let i=0;i<arr.length;i++){
        result.push(3.14*arr[i]*arr[i])
    }
    return result
}

let display = calculate(arr)
console.log(display);


