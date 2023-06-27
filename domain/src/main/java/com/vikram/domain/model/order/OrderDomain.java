package com.vikram.domain.model.order;

import com.vikram.domain.model.product.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class OrderDomain {

    private Integer orderId;
    private Integer amount;
    private LocalDateTime creationDate;
    private ProductModel product;
}
