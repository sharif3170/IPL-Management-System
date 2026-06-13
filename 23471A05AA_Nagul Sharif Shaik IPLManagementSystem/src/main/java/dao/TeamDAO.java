package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Team;
public class TeamDAO {
  Connection con=DBConnection.getConnection();
  public void addTeam(String teamname,String captain,String homeGround) {
	  try {
		  PreparedStatement st=con.prepareStatement("Insert into teams (team_name,captain,home_ground) values (?,?,?)");
		  st.setString(1, teamname);
		  st.setString(2, captain);
		  st.setString(3, homeGround);
		  st.executeUpdate();
		  System.out.println("Team inserted");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  
  }
  
  
  public List< Team > getAllTeams()
  {
	  
	  List<Team> teams=new ArrayList<>();
	  try 
	  {
		String query="Select * from teams";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			Team t=new Team();
			t.setId(rs.getInt("teamId"));
			t.setName(rs.getString("team_name"));
			t.setCaptain(rs.getString("captain"));
			t.setHomeGround(rs.getString("home_ground"));
			
			teams.add(t);
		}
	 } 
	 catch (SQLException e) 
	  {
	
		e.printStackTrace();
	  }
	  return teams;
  }
}
