package com.railway.service;

import com.railway.dao.IntervalDao;
import com.railway.model.Interval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Администратор on 24.10.2015.
 */
@Service
public class IntervalServiceImpl implements IntervalService {

    @Autowired
    IntervalDao dao;
    @Override
    public void addInterval(Interval interval) {
          dao.addInterval(interval);
    }

    @Override
    public List<Interval> getAllIntervals() {
        return dao.findAllIntervals();
    }
}
