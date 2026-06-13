<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="Model.Team"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IPL Teams</title>
</head>
<body>
	<%
	List<Team> teams = (List<Team>) request.getAttribute("teams");
	%>
	<h2>Teams List</h2>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>Team Name</th>
			<th>Captain</th>
			<th>Home Ground</th>
		</tr>

		<%
		for(Team team: teams){
			
		%>

		<tr>
			<td><%= team.getId() %></td>
			<td><%= team.getName() %></td>
			<td><%= team.getCaptain() %></td>
			<td><%= team.getHomeGround() %></td>
		</tr>

		<%
}
%>
	</table>
</body>
</html>