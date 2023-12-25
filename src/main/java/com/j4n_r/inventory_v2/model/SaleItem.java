package com.j4n_r.inventory_v2.model;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO Add Purchase items +
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "sale_items")
public class SaleItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long saleItemId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Drink productId;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale saleId;

    private int saleQuantity;
    private double salePrice;
}


