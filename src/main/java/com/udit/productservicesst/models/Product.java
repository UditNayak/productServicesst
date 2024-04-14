package com.udit.productservicesst.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor  // All Arguments Constructor
@NoArgsConstructor   // No Argument Constructor ( Default Constructor )
@Entity
public class Product {
    @Id
    private Long id;
    private String title;
    private String description;
    private double price;
    @ManyToOne
    private Category category;
    private String image;
}
