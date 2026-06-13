<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 String username=(String)session.getAttribute("username");
 if(username==null)
 {
	 response.sendRedirect("login.jsp");
 }
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IPL Dashboard</title>
</head>
<body>
    <h2> Hello, Welcome <%=username %></h2>
    
    <a href="logout">Logout</a>
    <a href="addTeam.jsp">Add Team</a>
    <a href="teamservlet">View Teams</a>
    <a href="playerservlet">Add Player</a>
    <a href="playerservlet?action=view">View Players</a>
</body>
</html>