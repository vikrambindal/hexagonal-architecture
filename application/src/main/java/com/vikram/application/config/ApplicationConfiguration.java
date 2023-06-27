package com.vikram.application.config;

import com.vikram.service.impl.OrderService;
import com.vikram.service.impl.ProductService;
import com.vikram.service.port.out.LoadOrderPort;
import com.vikram.service.port.out.ProductStatePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public OrderService orderService(LoadOrderPort loadOrderPort) {
        return new OrderService(loadOrderPort);
    }

    @Bean
    public ProductService productService(ProductStatePort productStatePort) {
        return new ProductService(productStatePort);
    }
}
