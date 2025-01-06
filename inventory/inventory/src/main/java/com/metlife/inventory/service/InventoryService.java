package com.metlife.inventory.service;

import com.metlife.inventory.feign.UserFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final UserFeignClient userFeignClient;

    public List<String> getAllFood() {
        // Mock data for food names
        return Arrays.asList("Pizza", "Burger", "Pasta");
    }

    public List<String> placeOrder() {
        // Feign call to the user service to get all user names
        return userFeignClient.getAllUsers();
    }
}
