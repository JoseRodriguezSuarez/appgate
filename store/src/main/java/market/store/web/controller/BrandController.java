package market.store.web.controller;

import market.store.domain.Brand;
import market.store.domain.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;


    @GetMapping("/all")
    public List<Brand> getAll() {
        return brandService.getAll();
    }



}
