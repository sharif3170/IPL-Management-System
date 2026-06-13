package controller;

import java.io.IOException;
import java.util.List;

import Model.Team;
import dao.TeamDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/teamservlet")
public class TeamServlet extends HttpServlet{
   
	private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
   {
	  String teamname =request.getParameter("teamname");
	  String captain=request.getParameter("captain");
	  String ground=request.getParameter("homeground");
	  
	  TeamDAO td=new TeamDAO();
	  td.addTeam(teamname, captain, ground);
	  response.sendRedirect("dashboardServlet");
   }
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   TeamDAO td=new TeamDAO();
	   List<Team> teams=td.getAllTeams();
	   request.setAttribute("teams",teams);
	   
	   request.getRequestDispatcher("viewTeams.jsp")
	          .forward(request, response);
   }
}
