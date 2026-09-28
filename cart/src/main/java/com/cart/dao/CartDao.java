package com.cart.dao;

import com.cart.dao.entity.Cart;
import com.cart.dao.repo.CartRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CartDao {

    private final CartRepo repo;

    public List<Cart> findAll() {
        return repo.findAll();
    }
}
