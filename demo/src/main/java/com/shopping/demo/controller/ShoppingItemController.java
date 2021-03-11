package com.shopping.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.shopping.demo.model.ShoppingItem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingItemController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/shoppingItem")
    public ShoppingItem shoppingItem(@RequestParam(value = "name", defaultValue = "Unknown") String name,
    @RequestParam(value = "quantity", defaultValue = "1") int quantity){
        return new ShoppingItem(counter.incrementAndGet(), name, quantity);
    }
}
