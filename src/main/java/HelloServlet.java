import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, res);
        log("Invoke");

        if("GET".equals(req.getMethod())) {
            resp.getWriter().println("<a href='/AboutServlet'>About</a>");
        }
    }
}
