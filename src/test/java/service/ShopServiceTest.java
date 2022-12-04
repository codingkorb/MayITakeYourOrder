package service;

import repo.ProductRepo;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    void listProducts_whenCalled_returnAllProducts() {

        // Given
        ProductRepo productRepo = new ProductRepo();
        ShopService shopService = new ShopService(productRepo);

        // When

        // Then

    }

}