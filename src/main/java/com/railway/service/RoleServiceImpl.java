package com.railway.service;

import com.railway.dao.RoleDao;
import com.railway.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Администратор on 31.10.2015.
 */
@Service
public class RoleServiceImpl implements  RoleService {

    @Autowired
    RoleDao dao;
    @Override
    public Role userRole() {
        return dao.getUserRole();
    }
}
