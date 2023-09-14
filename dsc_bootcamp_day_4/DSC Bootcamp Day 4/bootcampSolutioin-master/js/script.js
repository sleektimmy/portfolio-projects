// leting JavaScript know the HTML elements
// i want to work with and declaring them as variables
var menuButton = document.getElementById('btn');
var menu = document.querySelector('.nav-menu');

// adding event listeners
// so the elements know what event to watch for
menuButton.addEventListener('click', showMe);

// creating the function to be carried out by the event
function showMe() {
  menu.classList.toggle('show');
}
