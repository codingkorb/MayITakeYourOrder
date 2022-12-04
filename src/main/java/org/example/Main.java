package org.example;

import model.Order;
import model.Product;
import repo.OrderRepo;
import repo.ProductRepo;
import service.ShopService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create products
        List<Product> products = List.of(
                new Product("F004", "Mousaka"),
                new Product("F005", "Baklava"),
                new Product("F006", "Briam")
        );
        ProductRepo productRepo = new ProductRepo(products);

        // Create Order
        OrderRepo orderRepo = new OrderRepo();
        Order order1 = new Order("Order-1", products);
        OrderRepo.addOrder(order1);

        // Create Shop Service
        ShopService shopService = new ShopService(productRepo, orderRepo);
        // Manually test Shop Service
        System.out.println(shopService.listProducts());
        System.out.println(shopService.getProduct("F004"));
        System.out.println(shopService.listOrders());
    }
}