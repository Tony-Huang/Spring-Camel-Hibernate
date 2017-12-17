package com.hdp.springdemo.persistence;

import com.hdp.springdemo.model.Role;

/**
 * Created by admin on 2017/12/15.
 */
public interface RoleDAO {

    void saveRole(Role r);
    void updateRole(Role r);
}
