package com.stackroute.springMuzix.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document
public class Track {

    //defince the fields


    //    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

//    @Column(name = "track_name")
    private String trackName;

//    @Column(name = "track_comments")
    private String trackComments;



    //defince the constructor

    public Track() {

    }

    public Track(String trackName, String trackComments) {
        this.trackName = trackName;
        this.trackComments = trackComments;
    }

    //define the getter/setter method



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }


    //define the toString

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", trackName='" + trackName + '\'' +
                ", trackComments='" + trackComments + '\'' +
                '}';
    }
}
