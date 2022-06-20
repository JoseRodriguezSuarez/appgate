package market.store.web.controller;

import market.store.domain.PricesProduct;
import market.store.domain.service.PricesProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prices")
public class PricesProductController {

    @Autowired
    private PricesProductService pricesProductService;

    @GetMapping("/all")
    public List<PricesProduct> getAll(){ return pricesProductService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<List<PricesProduct>> getByProduct(@PathVariable("id") int productId){

        return pricesProductService.getByProductId(productId);

    }
    @GetMapping("/priority/{priority}")
    public Optional<List<PricesProduct>> geyByPriority(@PathVariable("priority") int priority){

        return pricesProductService.getByPriority(priority);
    }




}
