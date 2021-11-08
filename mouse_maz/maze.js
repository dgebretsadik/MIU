$(document).ready(function () {
  let touched = false;
  let started = false;

  $("#start").click(function () {      
    $(".boundary").removeClass("youlose");
    touched = false;
    started = true;
    $("#status").text('Click the "S" to begin.');
  });

    $(".boundary").mouseover(function () {
        if (started) {
      $(".boundary").addClass("youlose");
      touched = true;
        }
    });

    $("#end").mouseover(function () {
        if (started) {
            $("#status").text(touched ? "You loose" : "You win!");
            started = false;
        }
    });  

    $("#maze").mouseleave(function(){
        if(started) {
            $(".boundary").addClass("youlose"); 
        }
    });
});