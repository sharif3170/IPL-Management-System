<%@page import="java.util.List"%>
<%@page import="Model.Team"%>

<%
List<Team> teams =(List<Team>)request.getAttribute("teams");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Player</title>
</head>
<body>

<h2>Add Player</h2>

<form action="playerservlet" method="post">

    Player Name:
    <input type="text" name="playerName">

    <br><br>

    Role:
    <select name="role">
        <option>Batsman</option>
        <option>Bowler</option>
        <option>All Rounder</option>
        <option>Wicket Keeper</option>
    </select>

    <br><br>

    Team:
    <select name="teamId">

    <%
    for(Team team : teams){
    %>

        <option value="<%=team.getId()%>">
            <%=team.getName()%>
        </option>

    <%
    }
    %>

    </select>

    <br><br>

    <input type="submit" value="Add Player">

</form>

</body>
</html>