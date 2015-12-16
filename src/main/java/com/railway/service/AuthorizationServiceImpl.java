package com.railway.service;

import com.railway.dao.IntervalDao;
import com.railway.dao.UserDao;
import com.railway.model.Interval;
import com.railway.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Администратор on 24.10.2015.
 */
@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    UserDao dao;

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }
}
