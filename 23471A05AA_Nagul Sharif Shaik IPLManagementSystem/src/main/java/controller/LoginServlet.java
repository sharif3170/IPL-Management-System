package controller;

import java.io.IOException;

import dao.LoginDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
	                     HttpServletResponse response)
	        throws IOException {

	    response.getWriter().println("Login Servlet Working");
	}

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        String user = request.getParameter("username");
        String password = request.getParameter("password");

        LoginDAO ld = new LoginDAO();

        if (ld.validate(user, password)) {

            HttpSession session = request.getSession();
            session.setAttribute("username", user);

            response.sendRedirect("dashboardServlet");

        } else {

            response.sendRedirect("login.jsp");
        }
    }
}