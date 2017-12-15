
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>home</title>
  </head>
  <body>

       <form action="./people/json/get" method="GET">
         <input type="submit" value="GET People">
       </form>
       <br>

       <form action="./people/json/postForm" method="POST">
         <input type="text" name="id" value="E001" size="30">
         <input type="text" name="name" value="Tony" size="30">
         <input type="submit" value="POST People">
       </form>




  </body>
</html>
