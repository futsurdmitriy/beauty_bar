/*
 * Class name :  OrderRESTController
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 17-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.controller.rest;

import fuda.com.beauty_bar.model.Client;
import fuda.com.beauty_bar.model.Haircut;
import fuda.com.beauty_bar.model.Order;
import fuda.com.beauty_bar.service.client.impls.ClientServiceImpl;
import fuda.com.beauty_bar.service.order.impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/order")
@RestController
public class OrderRESTController {
    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("")
    String getIndex() {
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Order Controller</h1>";
    }

    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Client> getOrderList() {
        return orderService.getAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Order createOrder(@RequestBody Order order){
        order.setCreatedAt(LocalDateTime.now());
        order.setUpdatedAt(LocalDateTime.now());
        return orderService.create(order);
    }

    @CrossOrigin
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    Order deleteOrder(@PathVariable("id") String id){
        return orderService.delete(id);
    }
}
