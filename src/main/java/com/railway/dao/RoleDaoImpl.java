package com.railway.dao;

import com.railway.model.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Администратор on 31.10.2015.
 */
@Repository
@Transactional
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager manager;
    @Override
    public Role getUserRole() {
        return manager.find(Role.class, (long)1);
    }
}
