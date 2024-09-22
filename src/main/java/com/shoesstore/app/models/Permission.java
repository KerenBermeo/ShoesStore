package com.shoesstore.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Permission {
    private int id;
    private String permissionName;
}
