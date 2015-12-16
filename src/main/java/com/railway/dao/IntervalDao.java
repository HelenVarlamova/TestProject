package com.railway.dao;

import com.railway.model.Interval;
import com.railway.model.Station;

import java.util.List;

/**
 * Created by Администратор on 19.10.2015.
 */
public interface IntervalDao {

    void addInterval(Interval interval);

    public List<Interval> findAllIntervals();
}
