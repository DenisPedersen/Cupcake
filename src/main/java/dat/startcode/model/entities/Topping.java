package dat.startcode.model.entities;

import java.util.Objects;

public class Topping {

    int topping_id;
    String name;
    int price;

    public Topping(int topping_id, String name, int price) {
        this.topping_id = topping_id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Topping)) return false;
        Topping topping = (Topping) o;
        return getTopping_id() == topping.getTopping_id() && getPrice() == topping.getPrice() && getName().equals(topping.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTopping_id(), getName(), getPrice());
    }

    public int getTopping_id() {
        return topping_id;
    }

    public void setTopping_id(int topping_id) {
        this.topping_id = topping_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "topping_id=" + topping_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
