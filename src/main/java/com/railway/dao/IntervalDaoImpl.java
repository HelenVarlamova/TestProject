package com.railway.dao;

import com.railway.model.Interval;
import com.railway.model.Station;
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
public class IntervalDaoImpl implements IntervalDao {

    @PersistenceContext
    private EntityManager manager;


    @Override
    public void addInterval(Interval interval) {
        manager.persist(interval);
    }

    @Override
    public List<Interval> findAllIntervals() {
        List<Interval> intervals = manager.createQuery("Select a From Interval a", Interval.class).getResultList();
        return intervals;
    }
}
