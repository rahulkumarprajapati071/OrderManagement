package in.glootech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.glootech.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
