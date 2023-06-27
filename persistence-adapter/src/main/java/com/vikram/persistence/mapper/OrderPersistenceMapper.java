package com.vikram.persistence.mapper;

import com.vikram.persistence.entity.OrderJpaEntity;
import com.vikram.service.dto.OrderQueryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderPersistenceMapper {

    OrderPersistenceMapper ORDER_PERSISTENCE_MAPPER = Mappers.getMapper(OrderPersistenceMapper.class);

    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "creationDate", source = "creationDate", dateFormat = "dd.MM.yyyy")
    OrderQueryResponse toDto(OrderJpaEntity orderJpaEntity);

    List<OrderQueryResponse> toDto(List<OrderJpaEntity> orderJpaEntity);
}
