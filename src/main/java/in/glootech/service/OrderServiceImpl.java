package in.glootech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.glootech.entity.OrderHeader;
import in.glootech.repository.OrderHeaderRepo;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderHeaderRepo orderRepository;

    @Override
    public OrderHeader createOrder(OrderHeader request) {
        return orderRepository.save(request);
    }

    @Override
    public OrderHeader getOrder(String orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public List<OrderHeader> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderHeader updateOrder(String orderId, OrderHeader request) {
        if (orderRepository.existsById(orderId)) {
            request.setOrderId(orderId); // Ensure the correct ID is set
            return orderRepository.save(request);
        }
        return null; // Or throw an exception if not found
    }

    @Override
    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }
}
