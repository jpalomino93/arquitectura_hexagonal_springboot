package com.jpalomino.sample.hexagonal.infra.inputport;

import java.math.BigDecimal;

import com.jpalomino.sample.hexagonal.domain.Orders;

public interface OrderInputPort {
    public Orders createOrder( String customerId, BigDecimal total );
}