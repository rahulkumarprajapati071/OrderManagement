package in.glootech.service;

import java.util.List;

import in.glootech.entity.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product getProduct(String productId);
    List<Product> getAllProducts();
    Product updateProduct(String productId, Product product);
    void deleteProduct(String productId);
}
