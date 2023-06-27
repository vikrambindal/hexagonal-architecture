package com.vikram.persistence.service;

import com.vikram.persistence.entity.ProductJpaEntity;
import com.vikram.persistence.repository.ProductRepository;
import com.vikram.service.dto.CreateProductCommand;
import com.vikram.service.dto.ProductQueryResponse;
import com.vikram.service.port.out.ProductStatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.vikram.persistence.mapper.ProductPersistenceMapper.PRODUCT_PERSISTENCE_MAPPER;

@Component
@RequiredArgsConstructor
public class ProductPersistenceService implements ProductStatePort {

    private final ProductRepository productRepository;

    @Override
    public ProductQueryResponse createProduct(CreateProductCommand createProductCommand) {

        ProductJpaEntity productJpaEntity = PRODUCT_PERSISTENCE_MAPPER.toProductJpaEntity(createProductCommand);

        productJpaEntity = productRepository.saveAndFlush(productJpaEntity);

        return PRODUCT_PERSISTENCE_MAPPER.toProductQueryResponse(productJpaEntity);
    }
}
