package com.hdp.springdemo.services.impl;

import com.hdp.springdemo.model.People;
import com.hdp.springdemo.model.Role;
import com.hdp.springdemo.persistence.RoleDAO;
import com.hdp.springdemo.persistence.UserDAO;
import com.hdp.springdemo.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/12/15.
 */
//@Component
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    RoleDAO roleDAO;



    @Transactional(rollbackFor=Exception.class)
    public void savePeople(People people) {
        System.out.println("..people svc...");
        this.userDAO.savePeople(people);
        //Integer num = new Integer("abc"); //the above db operation should rollback if this line take effect
        this.roleDAO.saveRole(new Role());

    }

    @Transactional(rollbackFor=Exception.class)
    public void updatePeople(People people) {

    }

    public List<People> getAllPeople() {
        return null;
    }


    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public RoleDAO getRoleDAO() {
        return roleDAO;
    }

    public void setRoleDAO(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }
}
