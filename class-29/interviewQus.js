//using curryinng
// calculate('sum')(3)(4) -> 7
// calculate('substrat')(5)(2) -> 3
// calculate('multiply')(3)(4) -> 12
// calculate('divide')(8)(4) -> 2

function calculate(operation){
    return function (a){
        return function(b){
            if(operation =='sum'){
                return a+b;
            }else if(operation =='substract'){
                return a-b;
            }else if(operation == 'multiply'){
                return a*b;
            }else if(operation =='divide'){
                return a/b;
            }
        }
    }
}

console.log(calculate('sum')(3)(4));
console.log(calculate('multiply')(3)(4));
