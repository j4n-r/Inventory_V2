package com.j4n_r.inventory_v2;

import com.j4n_r.inventory_v2.model.Drink;
import com.j4n_r.inventory_v2.repository.DrinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryV2Application {

    public static void main(String[] args) {
        SpringApplication.run(InventoryV2Application.class, args);
    }

}



