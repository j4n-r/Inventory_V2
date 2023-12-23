package com.j4n_r.inventory_v2.repository;

import com.j4n_r.inventory_v2.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
