package com.railway.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Администратор on 24.10.2015.
 */
@Entity
@Table(name = "station")
public class Station  implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "station_id")
    private long station_id;

    @Column(name = "stationName")
    private String name;

 /*   @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "interval_way", joinColumns = { @JoinColumn(name = "station_id") }, inverseJoinColumns = { @JoinColumn(name = "train_id") })
    private Set<Train> trains = new HashSet<Train>();*/
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "stationIdArrive")
    private Set<Interval> intervalArrives = new HashSet<Interval>();

    public long getStation_id() {
        return station_id;
    }

    public void setStation_id(long station_id) {
        this.station_id = station_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Interval> getIntervalArrives() {
        return this.intervalArrives;
    }

    public void setIntervalArrives(Set<Interval> intervalArrives) {
        this.intervalArrives = intervalArrives;
    }

    /*

   @OneToMany(mappedBy = "station", cascade = CascadeType.ALL, orphanRemoval = true)
    public void setStationBindings(Set<StationBinding> stationBindings) {
        this.stationBindings = stationBindings;
    }*/
}
