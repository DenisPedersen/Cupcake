package dat.startcode.control;

import dat.startcode.model.config.ApplicationStart;

import dat.startcode.model.entities.CupcakeOrder;
import dat.startcode.model.persistence.ConnectionPool;
import dat.startcode.model.persistence.OrderMapper;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddToCart", value = "/AddToCart")
public class AddToCart extends HttpServlet {

    private ConnectionPool connectionPool;

    private OrderMapper orderMapper;

    @Override
    public void init() throws ServletException
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        int bottom_id = Integer.parseInt(request.getParameter("bottom_id"));
        int topping_id = Integer.parseInt(request.getParameter("topping_id"));
        int amount = Integer.parseInt(request.getParameter("amount"));

        CupcakeOrder cupcakeOrder = new CupcakeOrder(amount,bottom_id,topping_id);

        HttpSession session = request.getSession();

        request.setAttribute("cupcakeOrder", cupcakeOrder);
        request.getRequestDispatcher("WEB-INF/cart.jsp").forward(request,response);


    }
}
