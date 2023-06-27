package com.vikram.service.dto;

public record CreateProductCommand(String name, String description, Integer price) {
}
