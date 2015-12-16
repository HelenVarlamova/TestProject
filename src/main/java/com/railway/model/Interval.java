package com.railway.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.sql.Time;

/**
 * Created by Администратор on 24.10.2015.
 */
@Entity
@Table(name = "interval_way")
public class Interval implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "interval_way_id")
    private Long intervalId;

    @Column(name = "station_id")
    private long station_id;


    public Interval() {
    }

    //  @Column(name = "station_idAr")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "station_idAr", nullable = false)
    private Station stationIdArrive;

    @DateTimeFormat(pattern="hh:mm")
    @Column(name = "time_i", nullable = true)
    private Date time;

    public Long getIntervalId() {
        return intervalId;
    }

    public void setIntervalId(Long intervalId) {
        this.intervalId = intervalId;
    }

    public long getStation_id() {
        return station_id;
    }

    public void setStation_id(long station_id) {
        this.station_id = station_id;
    }


    public Station getStationIdArrive() {
        return stationIdArrive;
    }

    public void setStationIdArrive(Station stationIdArrive) {
        this.stationIdArrive = stationIdArrive;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
