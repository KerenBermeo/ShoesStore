package com.shoesstore.app.models;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Purchase {
    private int id;
    private int userId;
    private int productId;
    private int amount;
    private LocalDateTime date; // Investigar como funciona esto
}
