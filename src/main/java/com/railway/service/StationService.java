package com.railway.service;


import com.railway.model.Station;

import java.util.List;


/**
 * Created by ������������� on 17.10.2015.
 */
public interface StationService {

    void addStation(Station station);

    List<Station> getAllStations();
}
