package com.j4n_r.inventory_v2;

import com.j4n_r.inventory_v2.model.Drink;
import com.j4n_r.inventory_v2.model.User;
import com.j4n_r.inventory_v2.repository.DrinkRepository;
import com.j4n_r.inventory_v2.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class InventoryV2Application {

    public static void main(String[] args) {
        SpringApplication.run(InventoryV2Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder encoder) {
        return args -> {
            userRepository.save(new User("user", encoder.encode("password"), "ROLE_USER"));
            userRepository.save(new User("admin", encoder.encode("password"), "ROLE_ADMIN, ROLE_USER"));
        };
    }
}



