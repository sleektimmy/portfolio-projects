function theFormValidation(){
    const name = document.forms.name.value;
    const email = document.forms.email.value;
    const phone = document.forms.phone.value;
    const pass = document.forms.password.value;
    const cpass = document.forms.confirm_password.value;
    const lengthError = "Password must be up to 6 Characters";
    // const lengthErrorMax = "Password must not exceeed 6 Characters";/

    // if(name == ""){
    //     alert("A name field is required!")
    // }

    if(name == "")
{
    document.querySelector(".name-error").style.display = "block";
    return false;
// }
// if(isNaN(phone)){
//     alert("Phone is not a number");
//     return false;
// }

// if(pass !== cpass){
//    document.querySelector(".pass-error").style.display = "block";
//    return false;
// }

// if(pass.length <= 6){
//     document.querySelector(".lengthError").innerHTML = lengthError;
//     return false;
// }

// else{
//     document.querySelector(".lengthErrorMax").innerHTML = lengthErrorMax;
//     return false;
// }
}