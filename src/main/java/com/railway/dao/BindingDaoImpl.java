package com.railway.dao;

import com.railway.model.StationBinding;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Администратор on 29.10.2015.
 */
@Repository
@Transactional
public class BindingDaoImpl implements BindingDao {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public void add(StationBinding stationBinding) {
        manager.persist(stationBinding);
    }
}
