package com.vikram.service.impl;

import com.vikram.service.dto.CreateProductCommand;
import com.vikram.service.dto.ProductQueryResponse;
import com.vikram.service.port.in.ProductUseCase;
import com.vikram.service.port.out.ProductStatePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductService implements ProductUseCase {

    private final ProductStatePort productStatePort;

    @Override
    public ProductQueryResponse createProduct(CreateProductCommand createProductCommand) {

        return productStatePort.createProduct(createProductCommand);
    }
}
