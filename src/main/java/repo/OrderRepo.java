package repo;

import model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orders = new HashMap();  //Creating a new List for orders

    public void addOrder(Order order) { // Uebergabe Parameter von order und nicht orders
        orders.put(order.getId(), order);
    }
    public Order getOrder(String id){
        Order foundorder = orders.get(id);
        return foundorder;
    }

    public List<Order> listOrders() {
        return new ArrayList<>(orders.values()); // The List gets stored in an Array??  Not really sure about this

    }

}
