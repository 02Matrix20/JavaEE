package Lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SetCookies", urlPatterns = {"/setCookies"})
public class SetCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            response.addCookie(new Cookie("client", request.getParameter("client")));
            out.println("Cookie is set");
        } finally {
            out.close();
        }
    }
}

