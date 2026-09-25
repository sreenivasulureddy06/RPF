package com.rpf.inventory.service;

import com.rpf.inventory.dao.InventoryDao;
import com.rpf.inventory.dao.entity.Inventory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InventoryService {

    private final InventoryDao dao;

    public List<Inventory> findAll() {
        return dao.findAll();
    }
}
