

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;



/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String adminName = request.getParameter("adminName");
        String adminPass = request.getParameter("password");
        
        DatabaseManager db = new DatabaseManager();
		java.sql.Connection  con = db.getConnection();
		
		
		try {
			PreparedStatement preparedStatement = con.prepareStatement("select* from admin where adminName = '"+adminName+"' and adminPass = '"+adminPass+"'");
			ResultSet rs =((java.sql.Statement)preparedStatement).executeQuery("select* from admin where adminName = '"+adminName+"' and adminPass = '"+adminPass+"'");
			if(rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("adminname", adminName);
				response.sendRedirect("WelcomeAdmin.jsp");
			}
			else {
				//JOptionPane.showMessageDialog(null,"wrong","Error",JOptionPane.INFORMATION_MESSAGE);
				out.println("WRONG CREDENTIALS");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			out.println(e.getMessage());
		}
	}

}
