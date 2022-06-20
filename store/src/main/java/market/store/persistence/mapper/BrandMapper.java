package market.store.persistence.mapper;

import market.store.domain.Brand;
import market.store.persistence.entity.Grupo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {PricesProductMapper.class})
public interface BrandMapper {
    @Mappings({
            @Mapping(source = "idGrupo", target = "brandId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precios", target = "prices"),
    })
    Brand toBrand(Grupo grupo);
    List<Brand> toBrands(List<Grupo> grupos);

    @InheritInverseConfiguration
    Grupo toGrupo(Brand brand);


}
