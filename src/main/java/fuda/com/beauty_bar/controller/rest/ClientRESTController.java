/*
 * Class name :  ClientRESTController
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
import fuda.com.beauty_bar.service.client.impls.ClientServiceImpl;
import fuda.com.beauty_bar.service.haircut.impls.HaircutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/client")
@RestController
public class ClientRESTController {

    @Autowired
    ClientServiceImpl clientService;

    @RequestMapping("")
    String getIndex() {
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Client Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Client> getCleintList() {
        return clientService.getAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Client createClient(@RequestBody Client client){
        System.out.println(client);
        return clientService.create(client);
    }
}
