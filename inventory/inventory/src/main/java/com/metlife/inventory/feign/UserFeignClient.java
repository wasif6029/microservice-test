package com.metlife.inventory.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "user")
public interface UserFeignClient {

    @GetMapping("user/get-all-users")
    List<String> getAllUsers();
}
