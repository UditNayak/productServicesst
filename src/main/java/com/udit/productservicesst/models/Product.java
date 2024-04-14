package com.udit.productservicesst.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor  // All Arguments Constructor
@NoArgsConstructor   // No Argument Constructor ( Default Constructor )
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String image;
}
