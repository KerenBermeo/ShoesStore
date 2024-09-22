package com.shoesstore.app.models;


import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class User {
    private int id;
    private String name;
    private String email;
    private String passwordHash;
    private RolName rolId;

    @Builder.Default
    private boolean status = true;
}
