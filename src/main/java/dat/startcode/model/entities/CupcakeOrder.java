package dat.startcode.model.entities;

public class CupcakeOrder {

    int amount;
    int bottom_id;
    int topping_id;



    public CupcakeOrder(int amount, int bottom_id, int topping_id) {
        this.amount = amount;
        this.bottom_id = bottom_id;
        this.topping_id = topping_id;

    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBottom_id() {
        return bottom_id;
    }

    public void setBottom_id(int bottom_id) {
        this.bottom_id = bottom_id;
    }

    public int getTopping_id() {
        return topping_id;
    }

    public void setTopping_id(int topping_id) {
        this.topping_id = topping_id;
    }

    @Override
    public String toString() {
        return "CupcakeOrder{" +
                "amount=" + amount +
                ", bottom_id=" + bottom_id +
                ", topping_id=" + topping_id +
                '}';
    }
}
