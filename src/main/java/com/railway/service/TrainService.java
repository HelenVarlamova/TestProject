package com.railway.service;


import com.railway.model.Ticket;
import com.railway.model.Train;

import java.util.List;


/**
 * Created by Администратор on 17.10.2015.
 */
public interface TrainService {

    void addTrain(Train train);

    List<Train> getAllTrains();
}
