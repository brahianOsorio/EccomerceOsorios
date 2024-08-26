package com.Osorios.Ecommerce.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private String code;
    private String description;
    private String urlImage;
    private double price;
    private LocalDateTime created;
    private LocalDateTime modified;
    private int userId;
    private int categoryId;

}
