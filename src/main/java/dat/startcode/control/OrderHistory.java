package dat.startcode.control;

import dat.startcode.model.entities.Customer;
import dat.startcode.model.persistence.OrderMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "Order", value = "/Order")
public class OrderHistory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        Customer customer = (Customer) session.getAttribute("customer");
                if (customer == null) {

        Logger.getLogger("web").log(Level.SEVERE, "Bruger ikke logget ind");
        request.setAttribute("errormessage", "Du er ikke logget ind, prøv igen");
        request.getRequestDispatcher("error.jsp").forward(request, response);
                }

        OrderMapper ordermapper = new OrderMapper();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
