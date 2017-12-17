package com.hdp.springdemo.services;

import com.hdp.springdemo.model.People;

import java.util.List;

/**
 * Created by admin on 2017/12/15.
 */
public interface PeopleService {

    void savePeople(People people);
    void updatePeople(People people);

    List<People> getAllPeople();
}
