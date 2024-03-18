console.log("hello");

let array=[1,2,3,4,5];
// console.log(array);

for(let i of array){
    // console.log(i);
}

//higher order function
array.forEach(function(i) {
    // console.log(i);
});

//arrow function
array.forEach((i) =>{
    // console.log(i);
});

//reverse array
const arr = array.reverse((i) =>{
    return i;
})

// console.log(arr);

//filter method
const arr1 = array.filter((i) =>{
    return i > 3;
})

console.log(arr1);

//reduce method
const sum = array.reduce((accumilator, currentValue) =>{
    return  accumilator + currentValue;
},1);
console.log(sum);