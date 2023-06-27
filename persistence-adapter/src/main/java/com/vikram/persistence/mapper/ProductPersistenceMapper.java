package com.vikram.persistence.mapper;

import com.vikram.domain.model.product.ProductModel;
import com.vikram.persistence.entity.ProductJpaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductPersistenceMapper {

    ProductPersistenceMapper PRODUCT_PERSISTENCE_MAPPER = Mappers.getMapper(ProductPersistenceMapper.class);

    ProductJpaEntity toProductJpaEntity(ProductModel productModel);

    ProductModel toProductModel(ProductJpaEntity productJpaEntity);

    List<ProductModel> toProductModel(List<ProductJpaEntity> productJpaEntityList);
}
