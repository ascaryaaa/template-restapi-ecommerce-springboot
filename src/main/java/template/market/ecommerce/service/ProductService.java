package template.market.ecommerce.service;

import template.market.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    Product saveProduct(Product product);

    void deleteProductById(Long id);

    Product updateProductById(Long id, Product product);

    List<Product> findAll();
}
