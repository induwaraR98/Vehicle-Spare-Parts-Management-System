package com.Contact;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("unused")
@WebServlet("/updateContactServ")
public class updateContactServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String cname = request.getParameter("company");
		
		boolean isTrue;
		
		isTrue= newDButil.updatecontact(id,name, phone, email, address, cname);
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("phone", phone);
		request.setAttribute("email", email);
		request.setAttribute("address", address);
		request.setAttribute("cname", cname);
		
        if(isTrue==true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("cusAcc.jsp");
			dis.forward(request, response);
		}else {
			
			RequestDispatcher dis2= request.getRequestDispatcher("fail.jsp");
			dis2.forward(request, response);
		}

	}



}
