package com.vikram.service.port.out;

import com.vikram.service.dto.ProductQueryResponse;

public interface LoadProductPort {
    ProductQueryResponse getProductById(Integer productId);
}
