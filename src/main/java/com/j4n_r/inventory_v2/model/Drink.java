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
@Table(name = "drinks")
public class Drink {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private boolean isAlcoholic;
    private double productPurchasePrice;
    private double productSalePrice;
    private int availableQuantity;
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
