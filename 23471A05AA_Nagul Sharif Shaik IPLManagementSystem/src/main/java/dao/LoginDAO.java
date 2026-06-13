package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginDAO {
	Scanner sc=new Scanner(System.in);
    public boolean validate(String u,String p)
    {
    	
    	try {
    		Connection con=DBConnection.getConnection();
    		
    		PreparedStatement st=con.prepareStatement("Select * from admin where username=? and password=?");
    		st.setString(1, u);
    		st.setString(2, p);
    		
    		ResultSet rs=st.executeQuery();
    		
    		return rs.next();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return false;
    	
    }
}
