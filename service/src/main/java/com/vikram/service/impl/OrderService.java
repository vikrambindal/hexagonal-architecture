package com.vikram.service.impl;

import com.vikram.service.dto.OrderQueryResponse;
import com.vikram.service.port.in.OrderQueryUseCase;
import com.vikram.service.port.in.OrderUseCase;
import com.vikram.service.port.out.LoadOrderPort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class OrderService implements OrderQueryUseCase, OrderUseCase {

    private final LoadOrderPort loadOrderPort;

    @Override
    public List<OrderQueryResponse> retrieveOrders() {

        return loadOrderPort.loadOrders();
    }
}
