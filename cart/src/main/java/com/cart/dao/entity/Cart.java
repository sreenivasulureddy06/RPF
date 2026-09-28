package com.cart.dao.entity;

import com.cart.beans.CartBean;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "RPF_CART")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private Long recordId;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE")
    private Double price;

    public CartBean populateData() {
        CartBean bean = new CartBean();
        bean.setRecordId(this.recordId);
        bean.setProductId(this.productId);
        bean.setPrice(this.price);
        bean.setProductName(this.productName);
        return bean;
    }
}
