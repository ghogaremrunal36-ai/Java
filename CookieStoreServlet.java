import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;


@WebServlet("/CookieStoreServlet")
public class CookieStoreServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        Cookie cookie = new Cookie("username", username);

        // Cookie will remain for 1 hour
        cookie.setMaxAge(60 * 60);

        response.addCookie(cookie);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Cookie Stored Successfully</h2>");
        out.println("<p>User Name: " + username + "</p>");
        out.println("<a href='CookieReadServlet'>Read Cookie</a>");
        out.println("</body>");
        out.println("</html>");
    }
}