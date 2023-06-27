package com.vikram.rest.adapter.in;

import com.vikram.rest.model.CreateOrderDto;
import com.vikram.rest.model.OrderResponseDto;
import com.vikram.service.dto.OrderQueryResponse;
import com.vikram.service.port.in.OrderQueryUseCase;
import com.vikram.service.port.in.OrderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.vikram.rest.mapper.OrderRestDtoMapper.ORDER_REST_DTO_MAPPER;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderResource {

    private final OrderQueryUseCase orderQueryUseCase;
    private final OrderUseCase orderUseCase;

    @GetMapping
    public List<OrderResponseDto> getOrders() {
        List<OrderQueryResponse> orderQueryResponseList = orderQueryUseCase.retrieveOrders();
        return ORDER_REST_DTO_MAPPER.toOrderResponseDto(orderQueryResponseList);
    }

    @PostMapping
    public OrderResponseDto createOrder(@RequestBody CreateOrderDto createOrderDto) {

//        OrderCreateCommand orderCreateCommand = ORDER_REST_DTO_MAPPER.toOrderResponseDto(createOrderDto);
//        OrderQueryResponse orderQueryResponse = orderUseCase.createOrder(orderCreateCommand);
//        return ORDER_REST_DTO_MAPPER.toOrderResponseDto(orderQueryResponse);
        return null;
    }
}
