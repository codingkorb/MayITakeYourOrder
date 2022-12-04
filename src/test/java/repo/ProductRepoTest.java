package repo;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test                      // After REFACTORING...See bottom for before
    void list_whenCalledReturnedAllProducts() {
        // Given
        ProductRepo productRepo = generateProductRepo(); // replace get.ProductRepo with generateProductRepo AFTER refaction

        // When

        List<Product> actual = productRepo.list();

        // Then
        List<Product>expected = List.of(         // The () is the Same as listing in-between {} in Arrays
                new Product("F001", "Souflaki"),
                new Product("F002", "Gyros"),
                new Product("F003", "Tzaziki"));
        assertEquals(expected, actual);
    }

    private static ProductRepo generateProductRepo() {
        Product product1 = new Product("F001", "Souflaki");
        Product product2 = new Product("F002", "Gyros");
        Product product3 = new Product("F003", "Tzaziki");

        List<Product> productList = List.of(product1, product2, product3);

        ProductRepo productRepo = new ProductRepo(productList);
        return productRepo;
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

        // Then
        Product expected = new Product("F003", "Tzaziki");
        assertEquals(product3, actual);
    }
}  /*  @Test                         BEFORE REFACTORING
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

        //// Then        ****must be replaced with this to refactor
        //        List<Product>expected = List.of(
        //                new Product("F001", "Souflaki");
        //                new Product("F002", "Gyros");
        //                new Product("F003", "Tzaziki"));
        //        assertEquals(productList, actual);

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
}*/