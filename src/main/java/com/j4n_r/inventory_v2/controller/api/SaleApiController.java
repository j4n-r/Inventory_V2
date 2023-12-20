package com.j4n_r.inventory_v2.controller.api;


import com.j4n_r.inventory_v2.model.Sale;
import com.j4n_r.inventory_v2.repository.SaleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sale")
public class SaleApiController {
    SaleRepository saleRepository;

    public SaleApiController(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @GetMapping("/{id}")
    public Sale getSale(@PathVariable("id") Long sale_id) {
        return saleRepository.findById(sale_id)
                .orElseThrow(() -> new EntityNotFoundException("Sale not found"));
    }


    // TODO add remaining get methods
    // TODO add post methods
}
