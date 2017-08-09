package com.example.amarsecurity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by amarendra on 09/08/17.
 */
@RequestMapping("/login")
@RestController
public class LoginResource {

    @GetMapping
    Map<String, String> login(){
        Map<String , String> map = new HashMap<>();
        map.put("id", UUID.randomUUID().toString());
        map.put("content", "Hello Amar!");
        return map;
    }
}
