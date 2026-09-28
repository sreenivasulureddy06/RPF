package com.cart.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartBean {
    private Long recordId;

    private Long productId;

    private String productName;

    private Double price;
}
