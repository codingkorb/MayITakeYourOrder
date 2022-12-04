package model;

import java.util.List;
import java.util.Objects;

public class Order {

    private String id;
    private List<Product> products;

    public Order(String id, List<Product> products) { //Generated a Constructor
        this.id = id;
        this.products = products;
    }

    public String getId() {   // Generate Getter and Setter
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override                       // Generate Equals() and HashCode()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }

    @Override
    public String toString() {                  // Generate toString
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }
}
