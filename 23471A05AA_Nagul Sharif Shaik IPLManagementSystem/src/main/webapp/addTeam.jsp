<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2> Add Team</h2>
  
  <form action="teamservlet" method="post">
     <table>
     <tr>
       <td><label>Team Name :</label></td>
     </tr>
      <tr>
       <td><input type="text" name="teamname" ></td>
     </tr>
     
     <tr>
       <td><label>Captain : </label></td>
     </tr>
      <tr>
       <td><input type="text" name="captain" ></td>
     </tr>
     
     <tr>
       <td><label>Home Ground : </label></td>
     </tr>
      <tr>
       <td><input type="text" name="homeground" ></td>
     </tr>
     
     <tr>
       <td><input type="submit" value="Add Team"></td>
     </tr>
    </table>
  </form>
</body>
</html>