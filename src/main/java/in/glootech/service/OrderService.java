package in.glootech.service;

import java.util.List;

import in.glootech.entity.OrderHeader;
import jakarta.persistence.criteria.Order;

public interface OrderService {
    OrderHeader createOrder(OrderHeader request);
    OrderHeader getOrder(String orderId);
    List<OrderHeader> getAllOrders();
    OrderHeader updateOrder(String orderId, OrderHeader request);
    void deleteOrder(String orderId);
}
