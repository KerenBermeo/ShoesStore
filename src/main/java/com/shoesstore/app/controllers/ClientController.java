package com.shoesstore.app.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.shoesstore.app.models.Product;
import com.shoesstore.app.services.ClientService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> viewProducts() {
        List<Product> products = clientService.viewProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/purchase")
    public ResponseEntity<Void> purchaseProduct(@RequestBody Product product, @RequestParam int userId) {
        clientService.purchaseProduct(product, userId);
        return ResponseEntity.ok().build();
    }
}
