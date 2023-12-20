package com.j4n_r.inventory_v2.controller.api;

import com.j4n_r.inventory_v2.model.Purchase;
import com.j4n_r.inventory_v2.repository.PurchaseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchase")
public class PurchaseApiController {
    PurchaseRepository purchaseRepository;

    public PurchaseApiController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @GetMapping("/{id}")
    public Purchase getPurchase(@PathVariable("id") Long purchase_id) {
        return purchaseRepository.findById(purchase_id)
                .orElseThrow(() -> new EntityNotFoundException("Purchase not found"));
    }

    // TODO add remaining get methods
    // TODO add post methods
}
