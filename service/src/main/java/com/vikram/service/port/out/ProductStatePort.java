package com.vikram.service.port.out;

import com.vikram.service.dto.CreateProductCommand;
import com.vikram.service.dto.ProductQueryResponse;

public interface ProductStatePort {

    ProductQueryResponse createProduct(CreateProductCommand createProductCommand);
}
