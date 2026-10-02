package com.cart.beans;

import com.cart.enums.ResponseCodes;
import lombok.Data;

@Data
public class BaseResponse {
    private ResponseCodes status =  ResponseCodes.SUCCESS;
    private HttpError error;
}
