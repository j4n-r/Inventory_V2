package com.j4n_r.inventory_v2.controller.api;

import com.j4n_r.inventory_v2.model.Drink;
import com.j4n_r.inventory_v2.repository.DrinkRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/drink", produces = "application/json")
@CrossOrigin(origins = "http://inventory_V2:8080")
public class DrinkApiController {
    private DrinkRepository drinkRepository;

    public DrinkApiController(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @GetMapping("/inventory-list")
    public List<Drink> getInventory() {
        return (List<Drink>) drinkRepository.findAll();
    }

    @GetMapping("/{id}")
    public Drink getDrink(@PathVariable("id") Drink drink) {
        return drink;
    }

    // TODO add remaining get methods
    // TODO add post methods
}