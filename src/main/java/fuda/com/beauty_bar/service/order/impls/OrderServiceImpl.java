/*
 * Class name :  OrderServiceImpl
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 17-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.service.order.impls;

import fuda.com.beauty_bar.datastorage.DataFake;
import fuda.com.beauty_bar.model.Order;
import fuda.com.beauty_bar.repository.OrderRepository;
import fuda.com.beauty_bar.service.order.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    DataFake dataFake;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order create(Order order) {
        return null;
    }

    @Override
    public Order get(String id) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public Order delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return orderRepository.findAll();
    }
}
