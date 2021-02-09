$(document).ready(function(){
    $("input").click(function(){
    });
});
    function fibonacci(num){ 
    var first=0; 
    var second=1;   
    for (i = 0; i < num; i++){
        var add; 
        add=first+second; 
        first=second; 
        second=add; 
    } 
    console.log('test');
    return second; 
} 