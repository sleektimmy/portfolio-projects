// function clickMe(){
// // document.querySelector("nav").style.display="block";
// const nav = document.querySelector("nav");
// const img = document.querySelector(".icon-img");

// if(nav.style.display == "block"){
//     nav.style.display = "none";
//     img.src = "./images/icon-menu.svg";
// }
// else{
//     nav.style.display = "block";
//     img.src = "./images/icon-close.svg";
// }
     
// }

const imgIcon = document.querySelector(".icon-img");
const navIcon = document.querySelector("nav");
imgIcon.addEventListener("click", ()=>
{

if(navIcon.style.display == "block"){
    navIcon.style.display = "none";
    imgIcon.src = "./images/icon-menu.svg";
}
else{
    navIcon.style.display = "block";
    imgIcon.src = "./images/icon-close.svg";
}
});