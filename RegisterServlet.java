import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String fullName = req.getParameter("fullName");
        String role = req.getParameter("role");

        User user = new User(0, username, password, fullName, role);

        try {
            UserDAO dao = new UserDAOImpl();
            dao.saveUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("User Registered Successfully");
    }
}
