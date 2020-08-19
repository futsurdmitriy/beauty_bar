/*
 * Class name :  UserServiceImpl
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 19-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.service.user.impls;

import fuda.com.beauty_bar.model.User;
import fuda.com.beauty_bar.service.user.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }
}
