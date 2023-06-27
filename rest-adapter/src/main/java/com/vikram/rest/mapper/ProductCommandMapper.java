package com.vikram.rest.mapper;

import com.vikram.rest.model.CreateProductDto;
import com.vikram.service.dto.CreateProductCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductCommandMapper {

    ProductCommandMapper PRODUCT_COMMAND_MAPPER = Mappers.getMapper(ProductCommandMapper.class);

    CreateProductCommand toCreateProductCommand(CreateProductDto createProductDto);
}
