package com.railway.service;


import com.railway.model.Interval;

import java.util.List;


/**
 * Created by Администратор on 17.10.2015.
 */
public interface IntervalService {

    void addInterval(Interval interval);

    List<Interval> getAllIntervals();
}
