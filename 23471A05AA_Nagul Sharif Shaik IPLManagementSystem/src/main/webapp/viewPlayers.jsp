<%@ page import="java.util.List" %>
<%@ page import="Model.Player" %>

<%
List<Player> players =
(List<Player>)request.getAttribute("players");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Players</title>
</head>
<body>

<h2>Players List</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Player Name</th>
    <th>Role</th>
    <th>Team</th>
</tr>

<%
for(Player p : players)
{
%>

<tr>
    <td><%= p.getPlayerId() %></td>
    <td><%= p.getPlayerName() %></td>
    <td><%= p.getRole() %></td>
    <td><%= p.getTeamName() %></td>
</tr>

<%
}
%>

</table>

</body>
</html>