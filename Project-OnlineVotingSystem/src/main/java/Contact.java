

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection conn = db.getConnection();
		
		String name = request.getParameter("name");
		String pnumber = request.getParameter("number");
		String email = request.getParameter("email");
		String comment = request.getParameter("comment");
		//out.print("hello");
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("insert into contact(name,pnumber,email,cmnt)values('"+name+"','"+pnumber+"','"+email+"','"+comment+"')");
			preparedStatement.executeUpdate();
			response.sendRedirect("Index.jsp");
			//response.sendRedirect("Thanks.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
