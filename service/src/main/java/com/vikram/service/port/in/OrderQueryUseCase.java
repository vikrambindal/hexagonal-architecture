package com.vikram.service.port.in;

import com.vikram.service.dto.OrderQueryResponse;

import java.util.List;

public interface OrderQueryUseCase {

    List<OrderQueryResponse> retrieveOrders();
}
