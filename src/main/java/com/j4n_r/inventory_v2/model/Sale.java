package com.j4n_r.inventory_v2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sale_id;

    // TODO reafactor after refactored drink to products
    @ManyToOne
    @JoinColumn(name = "drink_id")
    private Drink drink_id;

    private int quantity;
    private Date sale_date;

}
