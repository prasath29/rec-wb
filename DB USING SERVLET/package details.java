package details;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class studentdetails extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
           int Regno = Integer.parseInt(request.getParameter("regno"));
           int mark1 = Integer.parseInt(request.getParameter("os"));
           int mark2 = Integer.parseInt(request.getParameter("wd"));
           int mark3 = Integer.parseInt(request.getParameter("ml"));
           int mark4 = Integer.parseInt(request.getParameter("dm"));
           int mark5= Integer.parseInt(request.getParameter("dbms"));
           
           Connection con;
           Statement stmt;

              try
              {
                  Class.forName("org.apache.derby.jdbc.ClientDriver");
                  con = DriverManager.getConnection("jdbc:derby://localhost:1527/student","hari","hari" );
                  stmt = con.createStatement();
                  stmt.executeUpdate("insert into MARKS values('"+Regno+"','"+mark1+"','"+mark2+"','"+mark3+"','"+mark4+"','"+mark5+"')");
                  out.println("<h1>Inserted Successfully into the table MARKS</h1>");
              }
              catch(ClassNotFoundException | SQLException e){
                  out.println(e);
              }
        }

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
