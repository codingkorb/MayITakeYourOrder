package service;

import model.Product;
import repo.ProductRepo;

import java.util.List;

public class ShopService {

      private ProductRepo productRepo;  // imports repo.ProductRepo and
                                // you need to Generate a Constructor for ProductRepo here

    public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> listProducts(){
        List<Product> allProducts = productRepo.list();   // These 2 lines give out the same as
        return allProducts;                                  // return productRepo.list();

    }
    public Product getProduct(String id) {
        Product foundProduct = productRepo.get(id);
        return foundProduct;


    }
}
