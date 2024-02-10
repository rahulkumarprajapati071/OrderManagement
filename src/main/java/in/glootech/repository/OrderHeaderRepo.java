package in.glootech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.glootech.entity.OrderHeader;

public interface OrderHeaderRepo extends JpaRepository<OrderHeader,String>{

}
