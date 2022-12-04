package model;

import java.util.Objects;

public class Product {

    private String id;         // 1. created id and name
    private String name;

    public String getId() {     // 3.  generated Getters and Setters
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String id, String name) {   // 2. generated a constructor
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {       // 4. generate equals() and haschCode()
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {           // 5. generate toString()
        return "model.Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
