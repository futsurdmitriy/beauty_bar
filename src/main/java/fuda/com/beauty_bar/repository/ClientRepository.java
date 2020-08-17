/*
 * Class name :  ClientRepository
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 17-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.repository;

import fuda.com.beauty_bar.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
