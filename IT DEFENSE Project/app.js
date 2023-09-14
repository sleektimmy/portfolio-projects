let agg = document.getElementById("Agg");
let popup = document.getElementById("popup");
function validateSubmit(){
    var fname = document.summaryform.Fname.value;
    var lname = document.summaryform.Lname.value;
    var matric = document.summaryform.matric.value;
    var score1 = parseInt(document.summaryform.score1.value);
    var score2 = parseInt(document.summaryform.score2.value);
    var score3 = parseInt(document.summaryform.score3.value);
    var score4 = parseInt(document.summaryform.score4.value);
    var total = score1 + score2 + score3 + score4;
    var avg = total/4;
    var course1 = document.summaryform.course1.value;
    var course2 = document.summaryform.course2.value;
    var course3 = document.summaryform.course3.value;
    var course4 = document.summaryform.course4.value;
    if(fname == "" || score1 == ""){
        alert("Please fill in blank fields");
        return false;
    }
    popup.classList.add("openPopUp");
    agg.classList.add("closeAgg");
    var sName = document.getElementsByClassName("sName");

    document.querySelector(".sName").innerHTML = fname;
    document.querySelector(".r").innerHTML = course1;
    document.querySelector(".m").innerHTML = course2;
    document.querySelector(".v").innerHTML = course3;
    document.querySelector(".vi").innerHTML = course4;
    document.querySelector(".fScore1").innerHTML = score1;
    document.querySelector(".fScore2").innerHTML = score2;
    document.querySelector(".fScore3").innerHTML = score3;
    document.querySelector(".fScore4").innerHTML = score4;
    document.querySelector(".aveScore").innerHTML = avg;
   if(avg>=70){
    document.querySelector(".remark").innerHTML = " A - Excellent!";
    document.querySelector(".remarkPro").innerHTML = "Outstanding job! Your dedication and hard work are paying off brilliantly";
    // return false;
}else if (avg>=60 && avg<=69){
    document.querySelector(".remark").innerHTML = "B - Good!";
    document.querySelector(".remarkPro").innerHTML = "Keep up the great work! You're doing exceptionally well.";
    
    // return false;
   }else if (avg>=50 && avg<=59){
    document.querySelector(".remark").innerHTML = "C - Satisfactory!";
    document.querySelector(".remarkPro").innerHTML = "You're on the right track. Continue to put in your best effort, and you'll see even more progress";
    // return false;
    
   }else if (avg>=45 && avg<=49){
    document.querySelector(".remark").innerHTML = "D - Barely Satisfactory";
    document.querySelector(".remarkPro").innerHTML = "You're passing, and that's a step forward. With a little extra effort, you can reach new heights";
    // return false;
   
   }else if (avg>=40 && avg<=44){
    document.querySelector(".remark").innerHTML = "E - Needs Improvement";
    document.querySelector(".remarkPro").innerHTML = "There's room for improvement, but you're making progress.";
   
    // return false;
   }else{
    document.querySelector(".remark").innerHTML = "F - Fail";
    document.querySelector(".remarkPro").innerHTML = " Don't be discouraged. Failing is a chance to learn and grow.";
    
    // return false;
   }
}

// function openPopUp(){
// }
function closePopUp(){
    agg.classList.remove("closeAgg");
    popup.classList.remove("openPopUp");
    window.location.reload()

}