package com.detroitlabs.repository;

import com.detroitlabs.model.CarLocation;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by paul on 2016/04/14.
 */
@Repository
public interface AutomotiveRepository extends MongoRepository<CarLocation, String> {

    //List<CarLocation> findByPositionNear(Point p, Distance d);
}
