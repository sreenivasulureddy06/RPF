package com.rpf.inventory.controller;

import com.rpf.inventory.dao.entity.Inventory;
import com.rpf.inventory.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@AllArgsConstructor
public class InventoryController {

    private final InventoryService service;

    @GetMapping("/find/all")
    public List<Inventory> findAll() {
        return service.findAll();
    }
}
