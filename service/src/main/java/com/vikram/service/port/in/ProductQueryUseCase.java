package com.vikram.service.port.in;

import com.vikram.domain.model.product.ProductModel;

import java.util.List;

public interface ProductQueryUseCase {

    ProductModel retrieveProductById(Integer productId) throws Exception;

    List<ProductModel> retrieveProducts();
}
