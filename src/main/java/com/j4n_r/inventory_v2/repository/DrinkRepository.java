package com.j4n_r.inventory_v2.repository;

import com.j4n_r.inventory_v2.model.Drink;
import org.springframework.data.repository.CrudRepository;


public interface DrinkRepository extends CrudRepository<Drink, Long> {
}