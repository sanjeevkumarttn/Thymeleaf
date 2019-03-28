$(document).ready(function(){
    var time=$.ajax({
            url :'/getTime',
            type :'GET'
    });
    time.done(function (data) {
        $("#time").append(data)
    });
    time.fail(function(){
        console.log("Error in fetching time");
    });
})

