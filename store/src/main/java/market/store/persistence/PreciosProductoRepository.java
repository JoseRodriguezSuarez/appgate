package market.store.persistence;

import market.store.domain.PricesProduct;
import market.store.domain.repository.PricesProductRepository;
import market.store.persistence.crud.PreciosProductoCrudRepository;
import market.store.persistence.entity.PreciosProducto;
import market.store.persistence.mapper.PricesProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PreciosProductoRepository implements PricesProductRepository {

    @Autowired
    private PreciosProductoCrudRepository preciosProductoCrudRepository;

    @Autowired
    private PricesProductMapper mapper;

    @Override
    public List<PricesProduct> getAll(){
        List<PreciosProducto> preciosProductos =(List<PreciosProducto>) preciosProductoCrudRepository.findAll();
        return mapper.toPricesProducts(preciosProductos);

    }

    @Override
    public Optional<List<PricesProduct>> getByProductId(int productId){
        return preciosProductoCrudRepository.findByProducto(productId)
                .map(preciosProductos -> mapper.toPricesProducts(preciosProductos));

    }

    @Override
    public Optional<List<PricesProduct>> getByPriority(int prioridad) {
        List<PreciosProducto> preciosProductos = preciosProductoCrudRepository.findByPriority(prioridad);
      return Optional.of(mapper.toPricesProducts(preciosProductos));
    }


}
