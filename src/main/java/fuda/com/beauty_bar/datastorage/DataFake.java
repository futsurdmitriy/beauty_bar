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
import fuda.com.beauty_bar.model.User;
import fuda.com.beauty_bar.repository.ClientRepository;
import fuda.com.beauty_bar.repository.HaircutRepository;
import fuda.com.beauty_bar.repository.UserRepository;
import fuda.com.beauty_bar.service.security.SecurityService;
import fuda.com.beauty_bar.service.user.impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Autowired
    SecurityService securityService;

    @Autowired
    UserRepository userRepository;

    List<User> users = new LinkedList<>(Arrays.asList(
            new User("fuda_admin", true,
                    "fuda_admin_pass123",
                    LocalDateTime.now(), LocalDateTime.now()),
            new User("fuda", false,
//                    securityService.passwordEncoder().encode("fuda_pass123"),
                    "fuda_pass123",
                    LocalDateTime.now(), LocalDateTime.now())
    ));

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
            new Client("Dima", "Andreevich",
                    "Futsur", "male", false,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Client("Yaroslav", "",
                    "Kasperovych", "male", false,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Client("Kate", "Andreevich",
                    "Basova", "female", false,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Client("Olexander", "",
                    "Panishev", "male", false,
                    LocalDateTime.now(), LocalDateTime.now()),
            new Client("Olexander", "",
                    "Zharov", "male", false,
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @PostConstruct
    private void init() {
//        String str = "TRATA";
//        System.out.println(str);
//        String result = securityService.passwordEncoder().encode(str);
//        System.out.println(str.getClass().getName());
//        System.out.println(result);

//        haircutRepository.deleteAll();
//        haircutRepository.saveAll(haircuts);
//        clientRepository.deleteAll();
//        clientRepository.saveAll(clients);
//        userRepository.deleteAll();
//        userRepository.saveAll(users);
    }

}
