package com.vikram.service.port.out;

import com.vikram.service.dto.OrderQueryResponse;

import java.util.List;

public interface LoadOrderPort {

    List<OrderQueryResponse> loadOrders();
}
