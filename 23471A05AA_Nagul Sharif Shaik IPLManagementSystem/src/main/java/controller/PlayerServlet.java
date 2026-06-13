package controller;

import java.io.IOException;
import java.util.List;

import Model.Player;
import Model.Team;
import dao.PlayerDAO;
import dao.TeamDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/playerservlet")
public class PlayerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if("view".equals(action))
        {
            PlayerDAO pd = new PlayerDAO();

            List<Player> players =pd.getAllPlayers();

            request.setAttribute("players", players);

            request.getRequestDispatcher("viewPlayers.jsp")
                   .forward(request, response);

            return;
        }

        TeamDAO td = new TeamDAO();

        List<Team> teams = td.getAllTeams();

        request.setAttribute("teams", teams);

        request.getRequestDispatcher("addPlayer.jsp")
               .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        String playerName =
                request.getParameter("playerName");

        String role =
                request.getParameter("role");

        int teamId =
                Integer.parseInt(
                    request.getParameter("teamId"));

        PlayerDAO pd = new PlayerDAO();

        pd.addPlayer(playerName, role, teamId);

        response.sendRedirect("dashboardServlet");
    }
}