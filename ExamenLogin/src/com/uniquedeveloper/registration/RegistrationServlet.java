package com.uniquedeveloper.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
//import java.sql.Connector;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//PrintWriter out = response.getWriter();
		//out.print("Working");
		
		String nombreUsuario = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher dispatcher = null;
		Connection con = null;
		//PrintWriter out = response.getWriter();
		//out.print("nombreUsuario");
		//out.print("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:8080/petSmile","root","Qaz159*zcm/E3");
			PreparedStatement pst = con.prepareStatement("insert into usuario(nombreUsuario, password) values (?,?)");
			pst.setString(1, nombreUsuario);
			pst.setString(2, password);
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("usuario.jsp");
			if (rowCount > 0) {
				request.setAttribute("status","success");				
			}else {
				request.setAttribute("status","failed");
			}
			
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();			
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}		
	}

}
