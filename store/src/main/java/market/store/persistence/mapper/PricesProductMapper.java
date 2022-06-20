package market.store.persistence.mapper;

import market.store.domain.PricesProduct;
import market.store.persistence.entity.PreciosProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProductMapper.class})
public interface PricesProductMapper {
    @Mappings({
            @Mapping(source = "idPP.idProducto", target = "productId"),
            @Mapping(source = "idPP.idGrupo", target = "brandId"),
            @Mapping(source = "start_date", target = "start_date"),
            @Mapping(source = "end_date", target = "end_date"),
            @Mapping(source = "price_list", target = "price_list"),
            @Mapping(source = "priority", target = "priority"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "curr", target = "curr"),
            @Mapping(target = "prices", ignore = true),
    })
    PricesProduct toPricesProduct(PreciosProducto preciosProducto);
    List<PricesProduct> toPricesProducts(List<PreciosProducto> preciosProductos);
    @Mappings({
            @Mapping(target = "grupo", ignore = true),
            @Mapping(target = "producto", ignore = true),

    })
    @InheritInverseConfiguration
    PreciosProducto toPreciosProducto(PricesProduct prices);

}
