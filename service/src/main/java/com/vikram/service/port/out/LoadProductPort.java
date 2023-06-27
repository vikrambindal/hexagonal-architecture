package com.vikram.service.port.out;

import com.vikram.domain.model.product.ProductModel;

import java.util.List;

public interface LoadProductPort {

    ProductModel getProductById(Integer productId) throws Exception;

    List<ProductModel> getProducts();
}
