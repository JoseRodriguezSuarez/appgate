package market.store.web.controller;

import market.store.domain.Product;
import market.store.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Integer productId) {
        return productService.getProductId(productId);
    }

    public Product save(Product product) {
        return productService.save(product);
    }

    public boolean delete(Integer idProduct) {
        return productService.delete(idProduct);
    }
}
