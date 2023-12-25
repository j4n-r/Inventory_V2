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
@Table(name = "purchase_items")
public class PurchaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long purchaseItemId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Drink productId;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchaseId;

    private int purchaseQuantity;
    private double purchasePrice;
}


