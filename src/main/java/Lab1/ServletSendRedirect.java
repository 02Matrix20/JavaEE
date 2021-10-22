package Lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSendRedicted", value = "/sendRedirect")
public class ServletSendRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/////////////// sendRedirect()
        String startShop = request.getParameter("startShop");
        if(startShop == null) {
            String path = request.getContextPath() + "/error";
            response.sendRedirect(path);
        }else {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            try {
                writer.println("<h2>startShop: " + startShop + "</h2>");
            } finally {
                writer.close();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
