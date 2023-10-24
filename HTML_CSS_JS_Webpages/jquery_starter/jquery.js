$(document).ready(function(){
    $("h1").click(function(){
        $(this).toggleClass("blue");
    });
});

$(document).ready(function(){
    $("header").click(function(){
        $(this).css("color", "purple");
    });
});

$(document).ready(function(){
    $(".p1").hover(function(){
        $(this).css("font-family", "Times New Roman");
    }, function(){
        $(this).css("font-family", "Georgia");
    });
});

$(document).ready(function(){
    $("button").click(function(){
        $(".pets").hide();
    });
});

$(document).ready(function(){
    $("#rainbows").dblclick(function(){
        alert("You double-clicked me!");
    });
});

$(document).ready(function(){
    $("input").focus(function(){
       $(this).css("background-color", "lightblue");
    });
});

$(document).ready(function(){
    $("input").keyup(function(){
        $(this).css("color", "red");
    });
});