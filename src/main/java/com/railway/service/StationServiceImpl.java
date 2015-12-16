package com.railway.service;

import com.railway.dao.StationDao;
import com.railway.model.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Администратор on 24.10.2015.
 */
@Service
public class StationServiceImpl implements StationService {

    @Autowired
    StationDao dao;
    @Override
    public void addStation(Station station) {
          dao.addStation(station);
    }

    @Override
    public List<Station> getAllStations() {
        return dao.findAllStations();
    }
}
