package com.vikram.service.port.in;

import com.vikram.domain.model.product.ProductModel;
import com.vikram.service.exception.EntityNotFoundException;

import java.util.List;

public interface ProductQueryUseCase {

    ProductModel retrieveProductById(Integer productId) throws EntityNotFoundException;

    List<ProductModel> retrieveProducts();
}
