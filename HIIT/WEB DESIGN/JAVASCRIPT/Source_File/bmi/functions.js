function calculate(){
    const weight = parseFloat(document.forms.weight.value);
    const height = parseFloat(document.forms.height.value);
    // // const answer = parseFloat(document.querySelector(".answer"));
    const secAns = weight*height;
    const KG = "KG"
    // alert(height);

    document.querySelector(".answer").innerHTML = secAns + KG;
    return false;


}
