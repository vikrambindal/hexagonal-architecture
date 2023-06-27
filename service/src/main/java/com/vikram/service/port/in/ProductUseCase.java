package com.vikram.service.port.in;

import com.vikram.domain.model.product.ProductModel;

public interface ProductUseCase {

    ProductModel createProduct(ProductModel productModel);
}
