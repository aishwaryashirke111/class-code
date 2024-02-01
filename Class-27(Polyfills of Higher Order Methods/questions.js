// Q5 Name Initials

// const input = "George Raymond Richard Martin";
// output = GRRM

const input = "George Raymond Richard Martin";
const output = input.split(' ').map(function(word){
    return word[0];
}).join('')
console.log(output);