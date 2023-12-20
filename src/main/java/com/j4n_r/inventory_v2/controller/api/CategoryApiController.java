package com.j4n_r.inventory_v2.controller.api;

import com.j4n_r.inventory_v2.model.Category;
import com.j4n_r.inventory_v2.repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryApiController {

    private CategoryRepository<Category, Number> categoryRepository;

    public CategoryApiController(CategoryRepository<Category, Number> categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable("id") Long category_id) {
        return categoryRepository.findById(category_id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
    }


    // TODO add remaining get methods
    // TODO add post methods
}
