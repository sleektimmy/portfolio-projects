// you can play with these values
var age = 0;
var gender = 'female';

function howOld() {
  if (age >= 18) {
    return 'adult';
  } else if (age >= 13 && age < 18) {
    return 'teen';
  } else if (age > 0 && age < 13) {
    return 'child';
  } else if (age <= 0) {
    return 'are you even alive?';
  } else {
    return 'how old?';
  }
}

// the console.log is used to log or note things in the browser console
// for example we can log a string or a  function
console.log('Bunmi');

// for a function it logs whatever the function returns
console.log(howOld());

function howOldwithArguments(age, gender) {
  if (age >= 18 && gender == 'female') {
    return 'adult woman';
  } else if (age <= 18 && gender == 'female') {
    return 'teen woman';
  } else if (age >= 18 && gender == 'male') {
    return 'adult man';
  } else if (age <= 18 && gender == 'female') {
    return 'teen man';
  } else {
    return 'what are you? A spirit?';
  }
}

// you can change this to any operator and test
function addition(num1, num2) {
  return num1 + num2;
}

// letting js know the existence of the button
var myButton = document.querySelector('.btn');

// adding event listner
myButton.addEventListener('click', myFunction);

// creating event function
function myFunction() {
  document.querySelector('h1').innerHTML = 'This is not my real face o';
}

// here i'm using a mouseover event so the title changes when you hover
// i wont use variable declarations here, but it is better practise to use variables
document.querySelector('h1').addEventListener('mouseover', function () {
  document.querySelector('h1').innerHTML = 'No, not magic. This is JavaScript';
});

document.querySelector('h1').addEventListener('mouseout', function () {
  document.querySelector('h1').innerHTML = 'JavaScript';
});

// the functions i used above without naming them is called anonymous functions
