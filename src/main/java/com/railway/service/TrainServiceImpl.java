package com.railway.service;

import com.railway.dao.TrainDao;
import com.railway.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Администратор on 17.10.2015.
 */

@Service
public class TrainServiceImpl implements TrainService{


    @Autowired
    TrainDao dao;

    @Override
    public void addTrain(Train train) {
        
        dao.addTrain(train);
    }

    @Override
    public List<Train> getAllTrains() {
        return dao.findAllTrains();
    }
}
