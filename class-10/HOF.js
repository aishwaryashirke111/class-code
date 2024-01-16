let arr = [2, 3, 4, 5, 6]
let result = []

function calculate(arr, cb) {
    for (let i = 0; i < arr.length; i++) {
        result.push(cb(arr[i]))
    }
    return result;
}

function square(arr) {
    return arr * arr;
}

let sqaredis = calculate(arr, square);
console.log(sqaredis);

function radius(arr1){
    return 3.14*arr1*arr1;
}

let radiusdis = calculate(arr,radius);
console.log(radiusdis)