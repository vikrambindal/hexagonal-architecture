package com.vikram.persistence.service;

import com.vikram.domain.model.product.ProductModel;
import com.vikram.persistence.entity.ProductJpaEntity;
import com.vikram.persistence.repository.ProductRepository;
import com.vikram.service.exception.EntityNotFoundException;
import com.vikram.service.port.out.LoadProductPort;
import com.vikram.service.port.out.ProductStatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.vikram.persistence.mapper.ProductPersistenceMapper.PRODUCT_PERSISTENCE_MAPPER;

@Component
@RequiredArgsConstructor
public class ProductPersistenceService implements ProductStatePort, LoadProductPort {

    private final ProductRepository productRepository;

    @Override
    public ProductModel createProduct(ProductModel productModel) {

        ProductJpaEntity productJpaEntity = PRODUCT_PERSISTENCE_MAPPER.toProductJpaEntity(productModel);

        productJpaEntity = productRepository.saveAndFlush(productJpaEntity);

        return PRODUCT_PERSISTENCE_MAPPER.toProductModel(productJpaEntity);
    }

    @Override
    public ProductModel getProductById(Integer productId) throws EntityNotFoundException {

        Optional<ProductJpaEntity> optProductEntity = productRepository.findById(productId);
        if (optProductEntity.isEmpty()) {
            throw new EntityNotFoundException("No product exist for the given record");
        }

        return PRODUCT_PERSISTENCE_MAPPER.toProductModel(optProductEntity.get());
    }

    @Override
    public List<ProductModel> getProducts() {

        List<ProductJpaEntity> productJpaEntityList = productRepository.findAll();

        return PRODUCT_PERSISTENCE_MAPPER.toProductModel(productJpaEntityList);
    }
}
