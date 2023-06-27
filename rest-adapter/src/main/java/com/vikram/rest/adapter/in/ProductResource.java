package com.vikram.rest.adapter.in;

import com.vikram.rest.model.CreateProductDto;
import com.vikram.rest.model.ProductResponseDto;
import com.vikram.service.dto.CreateProductCommand;
import com.vikram.service.dto.ProductQueryResponse;
import com.vikram.service.port.in.ProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.vikram.rest.mapper.ProductCommandMapper.PRODUCT_COMMAND_MAPPER;
import static com.vikram.rest.mapper.ProductResponseMapper.PRODUCT_RESPONSE_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductResource {

    private final ProductUseCase productUseCase;

    @GetMapping
    public void getProducts() {

    }

    @PostMapping
    public ProductResponseDto createProduct(@RequestBody CreateProductDto createProductDto) {

        CreateProductCommand createProductCommand = PRODUCT_COMMAND_MAPPER.toCreateProductCommand(createProductDto);
        ProductQueryResponse productQueryResponse = productUseCase.createProduct(createProductCommand);

        return PRODUCT_RESPONSE_MAPPER.toProductResponseDto(productQueryResponse);
    }
}
