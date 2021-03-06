/*
 * Class name :  HaircutServiceImpl
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 15-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.service.haircut.impls;

import fuda.com.beauty_bar.datastorage.DataFake;
import fuda.com.beauty_bar.model.Haircut;
import fuda.com.beauty_bar.repository.HaircutRepository;
import fuda.com.beauty_bar.service.haircut.interfaces.IHaircutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HaircutServiceImpl implements IHaircutService {

    @Autowired
    DataFake dataFake;

    @Autowired
    HaircutRepository haircutRepository;

    @Override
    public Haircut create(Haircut haircut) {
        return haircutRepository.save(haircut);
    }

    @Override
    public Haircut get(String id) {
        return haircutRepository.findById(id).orElse(null);
    }

    @Override
    public Haircut update(Haircut haircut) {
        haircut.setUpdatedAt(LocalDateTime.now());
        return haircutRepository.save(haircut);
    }

    @Override
    public Haircut delete(String id) {
        Haircut haircut = this.get(id);
        haircutRepository.deleteById(haircut.getId());
        return haircut;
    }

    @Override
    public List getAll() {
        return haircutRepository.findAll();
    }
}
