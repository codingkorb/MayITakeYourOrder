package repo;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void list_whenCalledReturnedAllProducts() {
        // Given
        Product product1 = new Product("F001", "Souflaki");
        Product product2 = new Product("F002", "Gyros");
        Product product3 = new Product("F003", "Tzaziki");

        List<Product> productList = List.of(product1, product2, product3);

        ProductRepo productRepo = new ProductRepo(productList);

        // When

        List<Product> actual = productRepo.list();

        // Then

        assertEquals(productList, actual);
    }
    @Test
    void get_whenGivenExistingId_returnProductById() {

        // Given
        Product product1 = new Product("F001", "Souflaki");
        Product product2 = new Product("F002", "Gyros");
        Product product3 = new Product("F003", "Tzaziki");

        List<Product> productList = List.of(product1, product2, product3);

        ProductRepo productRepo = new ProductRepo(productList);

        // When
        Product actual = productRepo.get("F003");
//

        // Then
        Product expected = new Product("F003", "Tzaziki");
        assertEquals(product3, actual);
    }
}