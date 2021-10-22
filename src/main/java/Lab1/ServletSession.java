package Lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSession", value = "/session")
public class ServletSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//////////////////// Session
        HttpSession session = request.getSession();
        String Operator = (String) session.getAttribute("Operator");
        PrintWriter out = response.getWriter();
        try {
            if(Operator == null) {
                session.setAttribute("Operator", "Yes");
                out.println("Session data is set");
            }
            else {
                out.println("Operator: " + Operator);
                // удаляем объект с ключом tourOperator
                session.removeAttribute("Operator");
            }
        }
        finally {
            out.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
