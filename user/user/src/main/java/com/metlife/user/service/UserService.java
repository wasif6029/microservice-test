package com.metlife.user.service;

import com.metlife.user.feign.InventoryFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final InventoryFeignClient inventoryFeignClient;

    public List<String> getAllUsers() {
        return Arrays.asList("Alice", "Bob", "Charlie");
    }

    public List<String> getMenu() {
        return inventoryFeignClient.getAllFood();
    }
}
