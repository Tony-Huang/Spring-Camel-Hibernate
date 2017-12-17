package com.hdp.springdemo.persistence.impl;

import com.hdp.springdemo.model.People;
import com.hdp.springdemo.persistence.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by admin on 2017/12/15.
 */
@Component
public class UserDAOImpl  implements UserDAO {

    public static String SQL_INSERT_USER="insert into users(name, passwd, roleId, roleName)" +
            " values (?, 'test1234', 3 , 'valid-users' ); ";

    @Autowired
    JdbcTemplate template;

    public void savePeople(People people) {
        System.out.println("..people Dao save...");
        this.template.update(SQL_INSERT_USER, new String[] { people.getName()});

    }

    public void updatePeople(People people) {

    }

    public List<People> getAllPeople() {
        return null;
    }


    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
