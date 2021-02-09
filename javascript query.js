$(document).ready(function(){
    $("h1").hover(function(){
        $(this).css("background-color","red");},
        function(){
            $(this).css("background-color"," blue");
    });
});