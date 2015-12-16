package com.railway.service;

import com.railway.dao.BindingDao;
import com.railway.model.StationBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Администратор on 29.10.2015.
 */
@Service
public class BindingServiceImpl    implements BindingService {

    @Autowired
    BindingDao dao;

    @Override
    public void addBinding(StationBinding stationBinding) {
        dao.add(stationBinding);
    }
}
