package com.railway.dao;

import com.railway.model.Train;

import java.util.List;

/**
 * Created by Администратор on 19.10.2015.
 */
public interface TrainDao {

    public Train findTrainByName(String name);

    void addTrain(Train train);

    public List<Train> findAllTrains();
}
