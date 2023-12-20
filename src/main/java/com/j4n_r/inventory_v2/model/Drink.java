package com.j4n_r.inventory_v2.model;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO Refactor everything to "Product"
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Drink {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long product_id;

    private String name;
    private boolean is_alcoholic;
    private double purchase_price;
    private double sale_price;
    private int available_quantity;
    private String img_url;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
