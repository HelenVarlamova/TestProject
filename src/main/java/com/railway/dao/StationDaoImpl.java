package com.railway.dao;

import com.railway.model.Station;
import com.railway.model.Train;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Администратор on 19.10.2015.
 */
@Repository
@Transactional
public class StationDaoImpl implements StationDao {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Station findTrainByName(Station name) {
        return null;
    }

    @Override
    public void addStation(Station station) {
        manager.persist(station);
    }

    @Override
    public List<Station> findAllStations() {
        List<Station> stations = manager.createQuery("Select a From Station a", Station.class).getResultList();
        return stations;
    }
}
