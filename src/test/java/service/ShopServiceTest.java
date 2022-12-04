package service;

import model.Product;
import org.junit.jupiter.api.Test;
import repo.ProductRepo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test

    void listProducts_whenCalled_returnAllProducts() {

        // Given
        ProductRepo productRepo =  generateProductRepo();
        ShopService shopService = new ShopService(productRepo);

        // When
        List<Product> actual = shopService.listProducts();

        // Then
        List<Product> expected = List.of(
                new Product("F001", "Souflaki"),
                new Product("F002", "Gyros"),
                new Product("F003", "Tzaziki")


        );
        assertEquals(expected, actual);
    }
    @Test
    void get_whenGivenId_returnsFoundProduct() {

          // Given
            ProductRepo productRepo =  generateProductRepo();  // Stolen from void listProducts_whenCalled_returnAllProducts() {
            ShopService shopService = new ShopService(productRepo);

            // When
            Product actual = shopService.getProduct("F003");
            //Then
            Product expected = new Product("F003", "Tzaziki");  //expected is defined here
            assertEquals(expected, actual);
        }
    private static ProductRepo generateProductRepo() {   // Stolen from ProductRepoTest
        Product product1 = new Product("F001", "Souflaki");
        Product product2 = new Product("F002", "Gyros");
        Product product3 = new Product("F003", "Tzaziki");

        List<Product> productList = List.of(product1, product2, product3);

        ProductRepo productRepo = new ProductRepo(productList);
        return productRepo;
    }

}