package com.shoesstore.app.models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String description;
    private String price;
    private String ref_img;
    private User id_user;

    public Product(User user_id) {
        this.id_user = user_id;
    }

    public User getUser_id() {
        return id_user;
    }
}


