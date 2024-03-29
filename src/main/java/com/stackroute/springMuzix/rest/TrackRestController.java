package com.stackroute.springMuzix.rest;


import com.stackroute.springMuzix.dao.TrackDAO;
import com.stackroute.springMuzix.entity.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TrackRestController {

    private TrackDAO trackDAO;
    //quick and dirty: inject track dao

    @Autowired
    public TrackRestController(TrackDAO y) {
        trackDAO = y;
    }

    @GetMapping("tracks/alltracks")
    public List<Track> findAllTracks() {
        return trackDAO.findAll();
    }

//    @GetMapping("tracks/{id}")
//    public  Track getTrack(@PathVariable int trackId) {
//        Track tr = trackDAO.findById(trackId);
//        return tr;
//    }

    @PostMapping("tracks")
    public Track addTrck(@RequestBody Track tr) {
//        tr.setId(0);
        Track _tr=trackDAO.insert(new Track(tr.getTrackName(),tr.getTrackComments()));

        return _tr;
    }

    @PutMapping("tracks")
    public Track update(@RequestBody Track track) {
        trackDAO.save(track);
        return track;
    }

    @DeleteMapping("tracks/{id}")
    public void delete(@PathVariable String id) {
//        Track tr = trackDAO.findById(id);
        trackDAO.deleteById(id);

    }


}
