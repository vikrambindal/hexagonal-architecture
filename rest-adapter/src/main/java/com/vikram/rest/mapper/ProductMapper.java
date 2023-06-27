package com.vikram.rest.mapper;

import com.vikram.domain.model.product.ProductModel;
import com.vikram.rest.model.CreateProductDto;
import com.vikram.rest.model.ProductResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductResponseDto toProductResponseDto(ProductModel productModel);

    List<ProductResponseDto> toProductResponseDto(List<ProductModel> productModelList);

    ProductModel toProductModel(CreateProductDto createProductDto);

}
