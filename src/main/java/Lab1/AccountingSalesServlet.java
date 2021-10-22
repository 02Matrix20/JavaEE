package Lab1;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "AccountingSalesServlet", urlPatterns = {"/shop"})
public class AccountingSalesServlet extends HttpServlet {
    private String message;

//    public void init() {
//        message = "Test doGet";
//    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //String startShop = request.getParameter("startShop");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html><body>");
       // printWriter.println("<h1> "+"startShop: " + startShop +  "</h1>");
        printWriter.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            String name = request.getParameter("username");
            String goods = request.getParameter("goods");
            String price = request.getParameter("price");
            String stock = request.getParameter("stock");
            String country = request.getParameter("country");
            writer.println("<p>Seller's name: " + name + "</p>");
            writer.println("<p>Quantity of goods: " + goods + "</p>");
            writer.println("<p>Price: " + price + "</p>");
            writer.println("<p>Availability in stock: " + stock + "</p>");
            writer.println("<p>Country of origin: " + country + "</p>");
        } finally {
            writer.close();
        }
    }
    public void destroy() {
    }
}
