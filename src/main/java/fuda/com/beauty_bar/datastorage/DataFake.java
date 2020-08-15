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

import fuda.com.beauty_bar.model.Haircut;
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

    public List<Haircut> getHaircuts() {
        return haircuts;
    }

    public void setHaircuts(List<Haircut> haircuts) {
        this.haircuts = haircuts;
    }

    @PostConstruct
    private void init(){
        haircutRepository.deleteAll();
        haircutRepository.saveAll(haircuts);
    }

}
