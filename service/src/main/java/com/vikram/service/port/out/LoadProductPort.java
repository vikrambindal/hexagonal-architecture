package com.vikram.service.port.out;

import com.vikram.domain.model.product.ProductModel;
import com.vikram.service.exception.EntityNotFoundException;

import java.util.List;

public interface LoadProductPort {

    ProductModel getProductById(Integer productId) throws EntityNotFoundException;

    List<ProductModel> getProducts();
}
