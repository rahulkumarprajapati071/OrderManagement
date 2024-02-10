package in.glootech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.glootech.entity.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, String>{

}
