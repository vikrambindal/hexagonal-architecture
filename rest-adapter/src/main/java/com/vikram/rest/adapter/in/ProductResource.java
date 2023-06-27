package com.vikram.rest.adapter.in;

import com.vikram.domain.model.product.ProductModel;
import com.vikram.rest.model.CreateProductDto;
import com.vikram.rest.model.ProductResponseDto;
import com.vikram.service.port.in.ProductQueryUseCase;
import com.vikram.service.port.in.ProductUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.vikram.rest.mapper.ProductMapper.PRODUCT_MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductResource {

    private final ProductUseCase productUseCase;
    private final ProductQueryUseCase productQueryUseCase;

    @Operation(summary = "Get All Products")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Products found", content =
            {@Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponseDto.class))}),
        @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
        @ApiResponse(responseCode = "404", description = "Book not found", content = @Content)})
    @GetMapping
    public List<ProductResponseDto> getProducts() {

        List<ProductModel> productModelList = productQueryUseCase.retrieveProducts();
        return PRODUCT_MAPPER.toProductResponseDto(productModelList);
    }

    @Operation(summary = "Get Products by Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product found", content =
                {@Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponseDto.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content)})
    @GetMapping("/{productId}")
    public ProductResponseDto getProductById(@PathVariable int productId) throws Exception {

        ProductModel productModel = productQueryUseCase.retrieveProductById(productId);
        return PRODUCT_MAPPER.toProductResponseDto(productModel);
    }

    @Operation(summary = "Create Product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product created", content =
                {@Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponseDto.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid product details supplied", content = @Content)})
    @PostMapping
    public ProductResponseDto createProduct(@RequestBody CreateProductDto createProductDto) {

        ProductModel productModel = PRODUCT_MAPPER.toProductModel(createProductDto);
        productModel = productUseCase.createProduct(productModel);

        return PRODUCT_MAPPER.toProductResponseDto(productModel);
    }
}
