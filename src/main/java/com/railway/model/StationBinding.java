package com.railway.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Администратор on 29.10.2015.
 */
@Entity
@Table(name = "station_binding")
public class StationBinding  implements Serializable {
    @Id
    @Column(name = "sb_id")
    private long StationBindingId;

    @Column(name = "depart_station")
    private long DepartStation;

    @Column(name = "arrive_station")
    private long ArriveStation;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "train_sb", joinColumns = { @JoinColumn(name = "sb_id")}, inverseJoinColumns = {@JoinColumn(name = "train_id") })
    private Set<Train> trains = new HashSet<Train>();

    public Set<Train> getTrains() {
        return trains;
    }

    public void setTrains(Set<Train> trains) {
        this.trains = trains;
    }

    public long getStationBindingId() {
        return StationBindingId;

    }

    public void setStationBindingId(long stationBindingId) {
        StationBindingId = stationBindingId;
    }

    public long getDepartStation() {
        return DepartStation;
    }

    public void setDepartStation(long departStation) {
        DepartStation = departStation;
    }

    public long getArriveStation() {
        return ArriveStation;
    }

    public void setArriveStation(long arriveStation) {
        ArriveStation = arriveStation;
    }
}
