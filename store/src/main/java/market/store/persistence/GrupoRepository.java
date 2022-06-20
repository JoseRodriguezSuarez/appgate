package market.store.persistence;

import market.store.domain.Brand;
import market.store.domain.repository.BrandRepository;
import market.store.persistence.crud.GrupoCrudRepository;
import market.store.persistence.entity.Grupo;
import market.store.persistence.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class GrupoRepository implements BrandRepository {
    @Autowired
    private GrupoCrudRepository grupoCrudRepository;

    @Autowired
    private BrandMapper mapper;


    @Override
    public List<Brand> getAll() {

        return mapper.toBrands((List<Grupo>) grupoCrudRepository.findAll());
    }


}


