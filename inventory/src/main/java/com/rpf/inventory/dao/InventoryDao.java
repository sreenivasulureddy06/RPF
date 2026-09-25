package com.rpf.inventory.dao;

import com.rpf.inventory.dao.entity.Inventory;
import com.rpf.inventory.dao.repo.InventoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class InventoryDao {

    private final InventoryRepo repo;

    public List<Inventory> findAll() {
        return repo.findAll();
    }

    public Inventory save(Inventory inventory) {
        return repo.save(inventory);
    }
}
