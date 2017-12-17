package com.hdp.springdemo.persistence;

import com.hdp.springdemo.model.People;

import java.util.List;

/**
 * Created by admin on 2017/12/15.
 */
public interface UserDAO {

    void savePeople(People people);
    void updatePeople(People people);

    List<People> getAllPeople();
}
