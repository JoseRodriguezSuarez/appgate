package market.store.domain.repository;
import market.store.domain.PricesProduct;

import java.util.List;
import java.util.Optional;

public interface PricesProductRepository {
    List<PricesProduct> getAll();
    Optional<List<PricesProduct>> getByProductId(int productId );
    Optional<List<PricesProduct>> getByPriority(int priority );
}
