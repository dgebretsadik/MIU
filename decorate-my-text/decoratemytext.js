window.onload = pageLoad;
function timer() {
    var startButton = document.getElementById('startBtn');
    startButton.onclick = myFunction;
}
function myFunction(){
   setInterval(function() {
    const fontChange = parseInt(document.getElementById('txt').style.fontSize) + 2 + "pt";
    document.getElementById('txt').style.fontSize = fontChange;
   }, 500);
   

}


function myFunction2(checkboxElem){
    if(checkboxElem.checked){
        document.getElementById('txt').style.fontWeight="bold";
        document.getElementById('txt').style.color="green";
        document.getElementById('txt').style.textDecoration = "underline";
        document.getElementById('bdy').style.backgroundImage = "url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzH8WiIxNWmB2VRsYRgCoalnBEjSRif_Ba4U_G40b1Zxbt5dODIjXJqFpZTHH0ustshNJDV88&usqp=CAc')" ;
    }
    else{
        document.getElementById('txt').style.fontWeight=""
        document.getElementById('txt').style.color="";
        document.getElementById('txt').style.textDecoration = "none";
        document.getElementById('bdy').style.backgroundImage = "none";
    }
}

function myFunction3(){
    var changeWords = document.getElementById('txt').value;
    if(changeWords.length >= 5){
        document.getElementById('txt').innerHTML = "Malkovich";
    }
}

function myFunction4(){
    var c = document.getElementById('txt').value;
    if(c.startsWith('a')  || c.startsWith('e') || c.startsWith('i') || c.startsWith('o') || c.startsWith('u')){
        document.getElementById('txt').innerHTML = "ay" + document.getElementById('txt').value;
    }
    else{
        document.getElementById('txt').innerHTML +="bb";
    }
}