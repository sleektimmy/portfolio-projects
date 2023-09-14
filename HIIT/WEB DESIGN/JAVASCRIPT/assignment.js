function yourBMI(ht, wt){
    const result = wt / (ht*ht);

    result_to_dec = result.toFixed(2);
    
    alert("Your BMI = " + result);
}

const ht = parseFloat(prompt('Enter your Height in Meters'));
const wt = parseFloat(prompt("Enter your weight in KG"));



yourBMI(ht,wt);