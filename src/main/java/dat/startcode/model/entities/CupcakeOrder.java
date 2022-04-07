package dat.startcode.model.entities;

public class CupcakeOrder {

    int amount;

    Bottom bottom;
    Topping topping;


    public Bottom getBottom() {
        return bottom;
    }

    public void setBottom(Bottom bottom) {
        this.bottom = bottom;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public CupcakeOrder(int amount, Bottom bottom, Topping topping) {
        this.amount = amount;
        this.bottom = bottom;
        this.topping = topping;

    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CupcakeOrder{" +
                "amount=" + amount +
                ", bottom=" + bottom +
                ", topping=" + topping +
                '}';
    }
}
