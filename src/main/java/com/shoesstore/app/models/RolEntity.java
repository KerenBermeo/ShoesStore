package com.shoesstore.app.models;

public class RolEntity {
    private int id;
    private Rol name;
    private Set<PermissionEntity> permission;

    public RolEntity(Rol name){
        this.name = name;
    }
    public Rol getRol(){
        return name;
    }
}
