package market.store.domain.repository;

import market.store.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product> getProductId(int productId);
    Product save(Product product);
    void delete(int productId);




}
