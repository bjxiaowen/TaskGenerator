package com.bp3.SpringPersonsExample.service;

import com.bp3.SpringPersonsExample.model.Person;
import com.bp3.SpringPersonsExample.repo.PersonDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by afahsl on 6/8/15.
 */
@Service
public class PersonServices {

    @Autowired
    PersonDatabase personDatabase;

    public Map<String, Person> getAllTasks(){
        return personDatabase.getAllTasks();
    }

}
