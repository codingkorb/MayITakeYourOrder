package service;

import repo.ProductRepo;

import java.util.List;

public class ShopService {

      private ProductRepo productRepo;  // imports repo.ProductRepo and
                                // you need to Generate a Constructor for ProductRepo here

    public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> listProducts(){
        return null;

    }
}
