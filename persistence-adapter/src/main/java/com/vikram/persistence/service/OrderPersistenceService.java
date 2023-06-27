package com.vikram.persistence.service;

import com.vikram.persistence.entity.OrderJpaEntity;
import com.vikram.persistence.repository.OrderRepository;
import com.vikram.service.dto.OrderQueryResponse;
import com.vikram.service.port.out.LoadOrderPort;
import com.vikram.service.port.out.OrderStatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.vikram.persistence.mapper.OrderPersistenceMapper.ORDER_PERSISTENCE_MAPPER;

@Component
@RequiredArgsConstructor
public class OrderPersistenceService implements LoadOrderPort, OrderStatePort {

    private final OrderRepository orderRepository;

    @Override
    public List<OrderQueryResponse> loadOrders() {
        List<OrderJpaEntity> orderJpaEntityList = orderRepository.findAll();
        return ORDER_PERSISTENCE_MAPPER.toDto(orderJpaEntityList);
    }
}
