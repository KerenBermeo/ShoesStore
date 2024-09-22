package com.shoesstore.app.mapper;

import com.shoesstore.app.dto.ClientDTO;
import com.shoesstore.app.models.RolName;
import com.shoesstore.app.models.User;

public class ClientDTOMapper {

    public static User toClientDTO(ClientDTO clientDTO){
        return User.builder() // Cambiado a "builder()" en lugar de "Builder()"
                .name(clientDTO.getName())
                .email(clientDTO.getEmail())
                .passwordHash(clientDTO.getPasswordHash())
                .rolId(RolName.CLIENTE) // Asumiendo que este ID corresponde al rol de CLIENTE
                .build();
    }
    
}
