package org.example;

import model.Product;
import repo.ProductRepo;
import service.ShopService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("F004", "Mousaka"),
                new Product("F005", "Baklava"),
                new Product("F006", "Briam")
        );
        ProductRepo productRepo = new ProductRepo(products);
        ShopService shopService = new ShopService(productRepo);
        System.out.println(shopService.listProducts());
        System.out.println(shopService.getProduct("F004"));
    }
}