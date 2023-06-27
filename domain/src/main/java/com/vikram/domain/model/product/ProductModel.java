package com.vikram.domain.model.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductModel {

    private Integer id;
    private String name;
    private Integer price;
    private String description;
}
