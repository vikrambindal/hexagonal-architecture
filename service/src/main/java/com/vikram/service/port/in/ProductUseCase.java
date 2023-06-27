package com.vikram.service.port.in;

import com.vikram.service.dto.CreateProductCommand;
import com.vikram.service.dto.ProductQueryResponse;

public interface ProductUseCase {

    ProductQueryResponse createProduct(CreateProductCommand createProductCommand);
}
