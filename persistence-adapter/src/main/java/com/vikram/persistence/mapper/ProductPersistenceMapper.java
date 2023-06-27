package com.vikram.persistence.mapper;

import com.vikram.persistence.entity.ProductJpaEntity;
import com.vikram.service.dto.CreateProductCommand;
import com.vikram.service.dto.ProductQueryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductPersistenceMapper {

    ProductPersistenceMapper PRODUCT_PERSISTENCE_MAPPER = Mappers.getMapper(ProductPersistenceMapper.class);

    ProductJpaEntity toProductJpaEntity(CreateProductCommand createProductCommand);

    ProductQueryResponse toProductQueryResponse(ProductJpaEntity productJpaEntity);
}
