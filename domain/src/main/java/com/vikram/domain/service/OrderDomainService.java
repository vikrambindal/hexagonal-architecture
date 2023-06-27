package com.vikram.domain.service;

import com.vikram.domain.model.order.OrderDomain;
import com.vikram.domain.port.in.OrderServicePort;
import com.vikram.domain.port.out.OrderPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class OrderDomainService implements OrderServicePort {

    private final OrderPersistencePort orderPersistencePort;
    @Override
    public List<OrderDomain> retrieveOrders() {

        return orderPersistencePort.getAllOrders();

    }
}
