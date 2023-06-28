package com.vikram.service.impl;

import com.vikram.domain.model.product.ProductModel;
import com.vikram.service.exception.EntityNotFoundException;
import com.vikram.service.port.in.ProductQueryUseCase;
import com.vikram.service.port.in.ProductUseCase;
import com.vikram.service.port.out.LoadProductPort;
import com.vikram.service.port.out.ProductStatePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductService implements ProductUseCase, ProductQueryUseCase {

    private final ProductStatePort productStatePort;
    private final LoadProductPort loadProductPort;

    @Override
    public ProductModel createProduct(ProductModel productModel) {

        return productStatePort.createProduct(productModel);
    }

    @Override
    public ProductModel retrieveProductById(Integer productId) throws EntityNotFoundException {

        return loadProductPort.getProductById(productId);
    }

    @Override
    public List<ProductModel> retrieveProducts() {

        return loadProductPort.getProducts();
    }
}
