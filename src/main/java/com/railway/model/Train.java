package com.railway.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Администратор on 19.10.2015.
 */
@Entity
@Table(name = "train")
public class Train implements Serializable {

    @Id
    @Column(name = "train_id")
    private long train_id;

    @Column(name = "name")
    private String Name;

    @Column(name = "place_count")
    private Integer placeCount;

    @DateTimeFormat(pattern="hh:mm")
    @Column(name = "time")
    private Date time;

    @ManyToMany
    private Set<User> userEntity = new HashSet<User>();

    @ManyToMany(mappedBy="train")
    private Set<Ticket> stations = new HashSet<Ticket>();

    @ManyToMany(mappedBy="trains")
    private Set<StationBinding> stationBindings = new HashSet<StationBinding>();

    public Integer getPlaceCount() {
        return placeCount;
    }

    public void setPlaceCount(Integer placeCount) {
        this.placeCount = placeCount;
    }

    public Set<StationBinding> getStationBindings() {
        return stationBindings;
    }

    public void setStationBindings(Set<StationBinding> stationBindings) {
        this.stationBindings = stationBindings;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStationDepart() {
        return StationDepart;
    }

    public void setStationDepart(String stationDepart) {
        StationDepart = stationDepart;
    }

    public Set<Ticket> getStations() {
        return stations;
    }

    public void setStations(Set<Ticket> stations) {
        this.stations = stations;
    }

    @Column(name = "station_depart")
    private String StationDepart;

    public long getTrain_id() {
        return train_id;
    }

    public void setTrain_id(long train_id) {
        this.train_id = train_id;
    }

    public long getId() {
        return train_id;
    }

    public void setId(long train_id) {
        this.train_id = train_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Set<User> getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(Set<User> userEntity) {
        this.userEntity = userEntity;
    }
}

