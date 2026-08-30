import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionStoreServlet")
public class SessionStoreServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        HttpSession session = request.getSession();

        session.setAttribute("username", username);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h2>Session Variable Stored Successfully</h2>");
        out.println("<p>User Name: " + username + "</p>");

        out.println("<br>");
        out.println("<a href='SessionReadServlet'>Read Session</a>");

        out.println("</body>");
        out.println("</html>");
    }
}