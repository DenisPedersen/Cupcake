package dat.startcode.model.persistence;

import dat.startcode.model.entities.Customer;
import dat.startcode.model.entities.Order;
import dat.startcode.model.entities.Orderline;
import dat.startcode.model.exceptions.DatabaseException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderMapper implements IOrderMapper{

    ConnectionPool connectionPool;

    public OrderMapper (ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public ArrayList<Orderline> getAllOrderlines(int order_id) {
        ArrayList<Orderline> orderlineArrayList = new ArrayList<>();

        Orderline orderline = null;
        String sql = "SELECT * FROM orderline_view_with_total WHERE order_id = ?";

        try (Connection connection = connectionPool.getConnection())
        {
            try (PreparedStatement ps = connection.prepareStatement(sql))
            {
                ps.setInt(1, order_id);

                ResultSet rs = ps.executeQuery();
                while (rs.next())
                {
                    int orderline_id = rs.getString("role_name");
                    orderline = new Customer(email, password, role);
                } else
                {
                    throw new DatabaseException("Wrong username or password");
                }
            }
        } catch (SQLException ex)
        {
            //throw new DatabaseException(ex, "Error logging in. Something went wrong with the database");
            System.out.println(ex);
        }
    }

    @Override
    public ArrayList<Order> getAllOrders() {
        String sql = "SELECT * FROM order";

        ArrayList<Order> orderArrayList = new ArrayList<>();

        try (ConnectionPool connectionPool) {

        }

    }
}
