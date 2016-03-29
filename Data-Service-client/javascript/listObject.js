$(document).ready(
function() {
    $.ajax({
            type:'GET',
            url: restURL+'/DO/list',
            crossDomain:true,
                dataType:'json',
                success: function(data){
                    if(data.success)
                    {
                        if(data.dolist.length!=0)
                        {
                            var content = "";
                            for(var i=0;i<data.dolist.length;i++)
                            {
                                content+="<div class='item'><div class='well'>";
                                content+="<a href='"+host+"objectpage.html?ID="+data.dolist[i].objectID+"&DOname="+data.dolist[i].doname+"' target='_blank'>"+data.dolist[i].doname+"</a>";
                                content+="</div></div>";
                            }
                            $('#objectlist').html(content);
                        }
                        else
                        {
                            $('#objectlist').html("No Data Object is found.");
                        }
                    }
                    else
                    {
                        $('#objectlist').html("Unexpected error. Please refresh and try again.");
                    }
                },
                error:function(data)
                {
                    alert("Unexpected error. Please refresh and try again.");
                }
    });
});

function getParameter(theParameter) {
    var params = window.location.search.substr(1).split('&');
    
    for (var i = 0; i < params.length; i++) {
        var p=params[i].split('=');
        if (p[0] == theParameter) {
            return decodeURIComponent(p[1]);
        }
    }
    return false;
}