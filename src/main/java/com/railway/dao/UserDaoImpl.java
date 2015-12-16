package com.railway.dao;

import com.railway.model.Interval;
import com.railway.model.User;
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
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager manager;


    @Override
    public void addUser(User user) {
        manager.persist(user);
    }
}
