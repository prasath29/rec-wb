import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/NewServlet1"})
public class NewServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out  = response.getWriter();
        String name = request.getParameter("numb");
        int goldrate = 5000;
        int n = Integer.parseInt(name); 
        out.print("Total rate for the given grams"+ n*goldrate);  
    }
}