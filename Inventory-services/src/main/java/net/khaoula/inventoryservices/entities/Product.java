package net.khaoula.inventoryservices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor@NoArgsConstructor @Getter@Setter @Builder @ToString
public class Product {
    @Id
    private String id;
    private  String nom;
    private double prix;
    private int quantity;
}
