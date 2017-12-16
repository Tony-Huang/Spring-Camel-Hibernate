package com.hdp.springdemo.persistence.impl;

import com.hdp.springdemo.model.Role;
import com.hdp.springdemo.persistence.RoleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/12/15.
 */
@Component
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    JdbcTemplate template;

    public void saveRole(Role r) {
        System.out.println("..Role dao save...");

    }

    public void updateRole(Role r) {

    }


    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
