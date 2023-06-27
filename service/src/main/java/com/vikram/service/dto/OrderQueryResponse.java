package com.vikram.service.dto;

public record OrderQueryResponse(Integer orderId, Integer productId, Integer amount, String creationDate) {
}
