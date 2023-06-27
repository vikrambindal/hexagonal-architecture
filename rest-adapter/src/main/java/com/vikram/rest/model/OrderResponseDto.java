package com.vikram.rest.model;

public record OrderResponseDto(Integer orderId, Integer productId, Integer amount, String creationDate) {
}
