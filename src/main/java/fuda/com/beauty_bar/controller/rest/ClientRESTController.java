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

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/client")
@RestController
@CrossOrigin
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

    @CrossOrigin
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Client createClient(@RequestBody Client client){
        client.setCreatedAt(LocalDateTime.now());
        client.setUpdatedAt(LocalDateTime.now());
        return clientService.create(client);
    }

    @CrossOrigin
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Client getClient(@PathVariable("id") String id) {
        return clientService.get(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    Client updateClient(@RequestBody Client client){
        return clientService.update(client);
    }

    @CrossOrigin
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    Client deleteClient(@PathVariable("id") String id){
        return clientService.delete(id);
    }
}
