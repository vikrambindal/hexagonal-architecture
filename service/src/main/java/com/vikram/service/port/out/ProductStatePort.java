package com.vikram.service.port.out;

import com.vikram.domain.model.product.ProductModel;

public interface ProductStatePort {

    ProductModel createProduct(ProductModel productModel);
}
