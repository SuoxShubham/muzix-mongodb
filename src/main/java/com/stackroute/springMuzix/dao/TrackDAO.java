package com.stackroute.springMuzix.dao;

//import com.stackroute.springMuzix.entity.Track;
//import com.stackroute.springMuzix.entity.Track;
import com.stackroute.springMuzix.entity.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TrackDAO extends MongoRepository<Track,String> {
//    public List<Track> findAll();

}
