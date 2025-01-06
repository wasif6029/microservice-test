package com.metlife.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "inventory")
public interface InventoryFeignClient {

    @GetMapping("inventory/get-all-food")
    List<String> getAllFood();
}
