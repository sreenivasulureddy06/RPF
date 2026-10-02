package com.cart.services;

import com.cart.beans.CartResponse;
import com.cart.dao.CartDao;
import com.cart.dao.entity.Cart;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CartService {

    private final CartDao dao;

    public ResponseEntity<CartResponse> findAll() {
        List<Cart> list = dao.findAll();
        CartResponse response = new CartResponse();
        response.setCarts(list.stream()
                .map(Cart::populateData).collect(Collectors.toList()));
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(response);
    }
}
