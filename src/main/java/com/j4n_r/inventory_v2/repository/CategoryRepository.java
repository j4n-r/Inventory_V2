package com.j4n_r.inventory_v2.repository;

import com.j4n_r.inventory_v2.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository<U, L extends Number> extends CrudRepository<Category, Long> {
}
