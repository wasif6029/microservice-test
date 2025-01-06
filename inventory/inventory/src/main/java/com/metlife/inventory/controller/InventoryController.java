package com.metlife.inventory.controller;

import com.metlife.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;


    @GetMapping("/get-all-food")
    public List<String> getAllFood() {
        return inventoryService.getAllFood();
    }

    @PostMapping("/place-order")
    public List<String> placeOrder() {
        return inventoryService.placeOrder();
    }
}
