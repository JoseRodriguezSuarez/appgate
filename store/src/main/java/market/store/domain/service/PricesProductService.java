package market.store.domain.service;

import market.store.domain.PricesProduct;
import market.store.domain.repository.PricesProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PricesProductService {

    @Autowired
    private PricesProductRepository pricesProductRepository;


    public List<PricesProduct> getAll(){ return pricesProductRepository.getAll();}


    public Optional<List<PricesProduct>> getByProductId(int productId ){
        return pricesProductRepository.getByProductId(productId);
    }

    public Optional<List<PricesProduct>> getByPriority(int prioridad){
        return pricesProductRepository.getByPriority(prioridad);
    }

}
