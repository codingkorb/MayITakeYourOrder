package service;

import model.Order;
import model.Product;
import repo.OrderRepo;
import repo.ProductRepo;

import java.util.List;

public class ShopService {

      private ProductRepo productRepo;  // imports repo.ProductRepo and
                                // you need to Generate a Constructor for ProductRepo here
      private OrderRepo orderRepo;
    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public List<Product> listProducts(){
        List<Product> allProducts = productRepo.list();   // These 2 lines give out the same as
        return allProducts;                                  // return productRepo.list();

    }
    public Product getProduct(String id) {
        Product foundProduct = productRepo.get(id);
        return foundProduct;


    }

    public void addOrder(Order order){
        orderRepo.addOrder(order);
    }
    public Order getOrder(String id) {
        Order foundOrder = orderRepo.getOrder(id);
        return foundOrder;
    }

    public List<Order> listOrders() {
       List<Order> foundOrders = orderRepo.listOrders();
       return foundOrders;
    }

}
