package com.shoesstore.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RolPermission {
  private int id;
  private int rolId;
  private int permissionId;
}
