package com.shoesstore.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private String password_hash;
    private Rol rol_id;

    public User(Rol rol) {
        this.rol_id = rol;
    }

    public Rol getRol() {
        return rol_id;
    }
}
