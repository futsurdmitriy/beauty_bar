/*
 * Class name :  UserRESTController
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 19-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.controller.rest;

import fuda.com.beauty_bar.model.User;
import fuda.com.beauty_bar.service.user.impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
public class UserRESTController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("")
    String getIndex() {
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from User Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<User> getOrderList() {
        return userService.getAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    User createOrder(@RequestBody User user){
        return userService.create(user);
    }
}
