<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
  <h2> IPL Tournament Login System</h2>
  
  <form action="login" method="post">
     <table>
     <tr>
       <td><label>User Name: </label></td>
     </tr>
      <tr>
       <td><input type="text" name="username" ></td>
     </tr>
     
     <tr>
       <td><label>Password: </label></td>
     </tr>
      <tr>
       <td><input type="text" name="password" ></td>
     </tr>
     
     <tr> 
       <td><input type="submit" value="Login"></td>
     </tr>
     </table>
  </form>
</body>
</html>