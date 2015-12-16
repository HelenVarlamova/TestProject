package com.railway.dao;

import com.railway.model.Station;

import java.util.List;

/**
 * Created by Администратор on 19.10.2015.
 */
public interface StationDao {

    public Station findTrainByName(Station name);

    void addStation(Station station);

    public List<Station> findAllStations();
}
