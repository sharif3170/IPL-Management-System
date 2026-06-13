package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Player;

public class PlayerDAO {

    Connection con = DBConnection.getConnection();

    public void addPlayer(String playerName,
                          String role,
                          int teamId) {

        try {

            String query =
                "insert into players(player_name, role, teamId) values(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, playerName);
            ps.setString(2, role);
            ps.setInt(3, teamId);

            ps.executeUpdate();

            System.out.println("Player Added Successfully");

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public List<Player> getAllPlayers()
    {
        List<Player> players = new ArrayList<>();

        try
        {
            String query =
                    "SELECT p.player_id, p.player_name, p.role, t.team_name " +
                    "FROM players p " +
                    "JOIN teams t ON p.teamId = t.teamId";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                Player p = new Player();

                p.setPlayerId(rs.getInt("player_id"));
                p.setPlayerName(rs.getString("player_name"));
                p.setRole(rs.getString("role"));
                p.setTeamName(rs.getString("team_name"));

                players.add(p);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return players;
    }
}