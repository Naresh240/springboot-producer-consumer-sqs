package com.arthurtira.sbs.service.impl;

import com.arthurtira.sbs.dto.OrderDto;
import com.arthurtira.sbs.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public void processOrder(OrderDto orderDto) {
        log.debug(" {} Process order from queue {} " +  orderDto);
    }
}
