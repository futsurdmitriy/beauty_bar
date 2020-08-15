/*
 * Class name :  HaircutRepository
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 15-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package fuda.com.beauty_bar.repository;

import fuda.com.beauty_bar.model.Haircut;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HaircutRepository extends MongoRepository<Haircut, String> {

}
