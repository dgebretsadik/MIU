(function(){
    'use strict'
 
   
    window.onload=function(){
    document.getElementById('btn').onclick=ruddyTimer;
    };
 
    var ruddyTimer=(function(){
      var timer=null; 
      return function(){
          if(timer===null){
          timer=setInterval(rudy,1000);
      }else{
          clearInterval(timer);
          timer=null;
      }
    }
    })();
 
    function rudy (){
        document.getElementById("result").innerHTML+='Rudy!'
    }
})();