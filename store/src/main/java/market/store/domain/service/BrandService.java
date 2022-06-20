package market.store.domain.service;

import market.store.domain.Brand;
import market.store.domain.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> getAll(){  return brandRepository.getAll();   }




}
