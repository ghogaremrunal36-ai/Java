import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionReadServlet")
public class SessionReadServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        out.println("<html>");
        out.println("<body>");

        if (session != null) {

            String username =
                    (String) session.getAttribute("username");

            if (username != null) {

                out.println("<h2>Session Value</h2>");
                out.println("<p>User Name: " + username + "</p>");

            } else {

                out.println("<h2>Session variable not found</h2>");
            }

        } else {

            out.println("<h2>No session exists</h2>");
        }

        out.println("<br>");
        out.println("<a href='index.html'>Back</a>");

        out.println("</body>");
        out.println("</html>");
    }
}