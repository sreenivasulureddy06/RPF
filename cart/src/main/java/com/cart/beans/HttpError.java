package com.cart.beans;

import lombok.Getter;

@Getter
public class HttpError {
    private final String code;
    private final String message;
    public HttpError(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
