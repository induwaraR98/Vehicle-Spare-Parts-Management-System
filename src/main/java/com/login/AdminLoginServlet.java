package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uemail = request.getParameter("username");
		String upwd = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		
		if(uemail == null || uemail.equals("")) {
			request.setAttribute("status","invalid email");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		if(upwd == null || upwd.equals("")) {
			request.setAttribute("status","invalid password");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser?useSSL=false","root","password");
			PreparedStatement pst = con.prepareStatement("select * from loguser where uemail = ? and upwd = ?");
			pst.setString(1, uemail);
			pst.setString(2, upwd);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("name",rs.getString("uname"));
				session.setAttribute("password", rs.getString("upwd"));
				session.setAttribute("email", rs.getString("uemail"));
				dispatcher = request.getRequestDispatcher("user-list.jsp");
			}else {
				request.setAttribute("status","failed");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
			
	} catch(Exception e) {
		e.printStackTrace();

     }
   }

}
