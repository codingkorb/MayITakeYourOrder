package repo;
import model.Order;

import model.Product;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void addOrder_whenGivenOrder_addsOrder(){

            // Given
        List<Product> products = List.of(
                new Product("F007", "Keftedes"),
                new Product("F008", "Soutzoukakia")

        );
        Order order1 = new Order("0-1", products);

        OrderRepo orderRepo = new OrderRepo();

            // When
        orderRepo.addOrder(order1);             //Creates an order
        Order actual = orderRepo.getOrder("0-1");

        // Then
        Order expected = new Order("0-1", products);
        assertEquals(expected, actual);
    }

    @Test

    void listOrders_whenCalled_returnsAllOrder(){

        // Given
        List<Product> products1 = List.of(
                new Product("F007", "Keftedes"),
                new Product("F008", "Soutzoukakia")

        );
        Order order1 = new Order("0-1", products1);

        List<Product> products2 = List.of(
                new Product("F009", "Kartoffeln"),
                new Product("F010", "Pommes")

        );
        Order order2 = new Order("0-2", products2);

        OrderRepo orderRepo = new OrderRepo();

        orderRepo.addOrder(order1);
        orderRepo.addOrder(order2);

        // When
        List<Order> actual = orderRepo.listOrders();


        // Then
        Order expectedOrder1 = new Order("0-1", products1);
        Order expectedOrder2 = new Order("0-2", products2);
        List<Order> expected = List.of(expectedOrder1, expectedOrder2);
        assertEquals(expected, actual);

    }

}