package net.khaoula.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity // cela indique que sera un table dans la base de données qui correspondant au classe (JPA annotations)
@NoArgsConstructor@AllArgsConstructor@Getter@Setter@Builder // builder pour creer lobjet
public class Customer {
    @Id  @GeneratedValue( strategy = GenerationType.IDENTITY) // (jpa annotations) GenerationType.IDENTITY indique que chaque fois le id sera incrementer par un
    private Long id;
    private String name ;
    private String email;
}
