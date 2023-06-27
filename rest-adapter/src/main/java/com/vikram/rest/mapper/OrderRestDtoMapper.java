package com.vikram.rest.mapper;

import com.vikram.rest.model.CreateOrderDto;
import com.vikram.rest.model.OrderResponseDto;
import com.vikram.service.dto.OrderCreateCommand;
import com.vikram.service.dto.OrderQueryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderRestDtoMapper {

    OrderRestDtoMapper ORDER_REST_DTO_MAPPER = Mappers.getMapper(OrderRestDtoMapper.class);

    OrderResponseDto toOrderResponseDto(OrderQueryResponse orderQueryResponse);

    List<OrderResponseDto> toOrderResponseDto(List<OrderQueryResponse> orderQueryResponse);

    OrderCreateCommand toOrderResponseDto(CreateOrderDto createOrderDto);
}
