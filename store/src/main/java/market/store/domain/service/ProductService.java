package market.store.domain.service;

import market.store.domain.Product;
import market.store.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProductId(Integer idProduct){
        return productRepository.getProductId(idProduct);

    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(Integer idProduct) {
        return getProductId(idProduct).map(product -> {
            productRepository.delete(idProduct);
            return true;
        }).orElse(false);
    }



}



