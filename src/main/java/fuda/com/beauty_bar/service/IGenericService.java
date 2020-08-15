/*
 * Class name :  IGenericService
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 15-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.service;

import java.util.List;

public interface IGenericService <T>{
    T create (T t);
    T get (String id);
    T update (T t);
    T delete (String id);
    List getAll();
}
