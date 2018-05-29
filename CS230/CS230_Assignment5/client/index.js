function retrieve(){
  xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function(){
    if (this.readyState == 4 && this.status == 200) {
         console.log(this.responseText);
   }
 };
 xhttp.open("GET", "../service/retrieve.php", true);
 xhttp.send();
}

$(document).ready(function(){
  $("#btnInsert").click(function(){
    var obj = {
      name : $("#Cname").val(),
      url : $("#Curl").val(),
      description : $("#Cdescription").val()
    };
    var jObj = JSON.stringify(obj);
    jObj= "q="+jObj;

    $.post("../service/insert.php",jObj, function(data, status){
          $("#createSpan").text(data);
      });

      $("#Cname").val("");
      $("#Curl").val("");
      $("#Cdescription").val("");
      retrieve();
  });
});

$(document).ready(function(){
  $("#btnDelete").click(function(){
    var obj = {
      id : $("#Did").val(),
    };
    var jObj = JSON.stringify(obj);
    jObj= "q="+jObj;

    $.post("../service/delete.php",jObj, function(data, status){
        $("#deleteSpan").text(data);
      });

    $("#Did").val("");
    retrieve();
  });
});

$(document).ready(function(){
  $("#btnUpdateName").click(function(){
    var obj = {
      id : $("#idUpdateName").val(),
      name : $("#newName").val()
    };
    var jObj = JSON.stringify(obj);
    jObj= "q="+jObj;

    $.post("../service/updateName.php",jObj, function(data, status){
        $("#updateSpan").text(data);
      });

      $("#idUpdateName").val("");
      $("#newName").val("");
      retrieve();
  });
});

$(document).ready(function(){
  $("#btnUpdateUrl").click(function(){
    var obj = {
      id : $("#idUpdateUrl").val(),
      url : $("#newUrl").val()
    };
    var jObj = JSON.stringify(obj);
    jObj= "q="+jObj;

    $.post("../service/updateUrl.php",jObj, function(data, status){
        $("#updateSpan").text(data);
      });
    $("#idUpdateUrl").val("");
    $("#newUrl").val("");
    retrieve();
  });
});

$(document).ready(function(){
  $("#btnUpdateDesc").click(function(){
    var obj = {
      id : $("#idUpdateDesc").val(),
      description : $("#newDesc").val()
    };
    var jObj = JSON.stringify(obj);
    jObj= "q="+jObj;

    $.post("../service/updateDescription.php",jObj, function(data, status){
        $("#updateSpan").text(data);
      });
    $("#idUpdateDesc").val("");
    description : $("#newDesc").val("");
    retrieve();
  });
});

$(document).ready(function(){
  $("#btnCreate").click(function(){
    $.get("../service/createtable.php", function(data, status){
        alert(data);
      });
    retrieve();
  });
});

$(document).ready(function(){
  $("#btnDrop").click(function(){
    $.get("../service/droptable.php", function(data, status){
          alert(data);
      });
    retrieve();
  });
});

$(document).ready(function(){
  $("#btnIdRetrieve").click(function(){
    var obj = {
      id : $("#idRetrieve").val(),
    };
    var jObj = JSON.stringify(obj);
    jObj= "q="+jObj;

    $.post("../service/retrieveId.php",jObj, function(data, status){
          $("#retrieveSpan").text(data);
      });
    $("#idRetrieve").val("");
    retrieve();
  });
});

$(document).ready(function(){
  $("#btnNameRetrieve").click(function(){
    var obj = {
      name : $("#nameRetrieve").val(),
    };
    var jObj = JSON.stringify(obj);
    jObj= "q="+jObj;
    $.post("../service/retrieveName.php",jObj, function(data, status){
          $("#retrieveSpan").text(data);
      });
    $("#nameRetrieve").val("");
    retrieve();
  });
});
