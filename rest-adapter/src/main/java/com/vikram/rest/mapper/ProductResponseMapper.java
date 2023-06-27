package com.vikram.rest.mapper;

import com.vikram.rest.model.ProductResponseDto;
import com.vikram.service.dto.ProductQueryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductResponseMapper {

    ProductResponseMapper PRODUCT_RESPONSE_MAPPER = Mappers.getMapper(ProductResponseMapper.class);

    ProductResponseDto toProductResponseDto(ProductQueryResponse productQueryResponse);
}
