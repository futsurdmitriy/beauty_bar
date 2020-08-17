/*
 * Class name :  DataFake
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 15-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.datastorage;

import fuda.com.beauty_bar.model.Client;
import fuda.com.beauty_bar.model.Haircut;
import fuda.com.beauty_bar.repository.ClientRepository;
import fuda.com.beauty_bar.repository.HaircutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    HaircutRepository haircutRepository;

    @Autowired
    ClientRepository clientRepository;

    List<Haircut> haircuts = new LinkedList<>(Arrays.asList(
            new Haircut("Avalon", "male", 125.00,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Haircut("Summertime", "male", 115.00,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Haircut("Bald", "female", 220.00,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Haircut("TimeSad", "male", 100.00,
                    LocalDateTime.now(), LocalDateTime.now())
    ));

    List<Client> clients = new LinkedList<>(Arrays.asList(
        new Client("Dima","Andreevich","Futsur", "male", false,
                LocalDateTime.now(), LocalDateTime.now()),
            new Client("Yaroslav","","Kasperovych", "male", false,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Client("Kate","Andreevich","Basova", "female", false,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Client("Olexander","","Panishev", "male", false,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Client("Olexander","","Zharov", "male", false,
                    LocalDateTime.now(), LocalDateTime.now())
    ));

    public List<Haircut> getHaircuts() {
        return haircuts;
    }

    public void setHaircuts(List<Haircut> haircuts) {
        this.haircuts = haircuts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @PostConstruct
    private void init(){
        haircutRepository.deleteAll();
        haircutRepository.saveAll(haircuts);
        clientRepository.deleteAll();
        clientRepository.saveAll(clients);
    }

}
