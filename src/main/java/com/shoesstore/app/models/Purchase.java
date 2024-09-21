package com.shoesstore.app.models;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Purchase {
    private int id;
    private User user_id;
    private Product product_id;
    private int amount;
    private LocalDate date;
    

    public Purchase(User user_id, Product product_id){
        this.user_id = user_id;
        this.product_id = product_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public Product getProduct() {
        return product_id;
    }

}
