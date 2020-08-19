/*
 * Class name :  UserRepository
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 19-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.repository;

import fuda.com.beauty_bar.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
