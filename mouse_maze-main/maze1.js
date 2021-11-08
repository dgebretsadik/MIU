$(document).ready(function(){
    $(".boundary").hover(function(){
        $(this).css("background-color", "red");
    });

   

    $("#end").mouseover(function(){
        if($(".boundary").css("background-color", "red")){
            $("#status").text("Sorry, you lost!");
        }

        else{
            $("#status").text("You win!");
        }
    
    });



    $("#start").click(function(){
        if($(".boundary").css("background-color", "red")){
            $(".boundary").css("background-color", "white");
        }
       
    });

});