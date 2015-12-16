package com.railway.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.railway.model.Train;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by Администратор on 19.10.2015.
 */
@Repository
@Transactional
public class TrainDaoImpl implements TrainDao {

    @PersistenceContext
    private EntityManager manager;


    @Override
    public Train findTrainByName(String name) {
        return manager.find(Train.class, name); //по id
    }

    @Override
    public void addTrain(Train train) {
       // return manager.find(Train.class, id);
         manager.persist(train);
    }

    @Override
    public List<Train> findAllTrains() {

            List<Train> trains = manager.createQuery("Select a From Train a", Train.class).getResultList();
            return trains;
    }

}
