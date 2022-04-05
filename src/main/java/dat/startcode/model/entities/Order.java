package dat.startcode.model.entities;

import java.util.Date;

public class Order {

    int order_id;
    Date date;

    public Order(int order_id, Date date) {
        this.order_id = order_id;
        this.date = date;
    }
}
