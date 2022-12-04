package repo;

import model.Product;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {  // 6. Class created in new repo package

    private Map<String, Product> products = new HashMap(); // 7. Map String from Class Product - declare products as item

    public ProductRepo(List<Product> productList) {   // 8. generate constructor

        for (Product product : productList) {
            products.put(product.getId(), product);
        }
    }

    // Methoden

    public List<Product> list(){           // 9. Generate 1st Test
        return new ArrayList<>(products.values()); // Makes an Arraylist out of the product.values
                                                      // (Changing of the Data Type aka "Casting")
    }

    public Product get (String id) {
        return products.get(id);
    }
}
