package com.j4n_r.inventory_v2.repository;

import com.j4n_r.inventory_v2.model.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase,Long> {
}
