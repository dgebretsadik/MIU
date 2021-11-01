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
        document.getElementById('bdy').style.backgroundImage = "url('https://th.bing.com/th/id/R.2d9fb6d88ed78c7da245998c3fef240c?rik=6yIVQd2X8PjSEg&riu=http%3a%2f%2fwww.wallpapers13.com%2fwp-content%2fuploads%2f2016%2f01%2fSunset-Background-Images-Hd-Sunset-background-images-hd-07329.jpg&ehk=7J99b98IPCvu0KnLxFH6gC%2bV%2b%2fcnD3GpSnjHO%2fJcNWE%3d&risl=&pid=ImgRaw&r=0')" ;
    }
    else{
        document.getElementById('txt').style.fontWeight=""
        document.getElementById('txt').style.color="";
        document.getElementById('txt').style.textDecoration = "none";
        document.getElementById('bdy').style.backgroundImage = "none";
    }
}
