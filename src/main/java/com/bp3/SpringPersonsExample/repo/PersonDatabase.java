package com.bp3.SpringPersonsExample.repo;

import com.bp3.SpringPersonsExample.model.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PersonDatabase {

    Map<String, Person> personDatabase;

    public PersonDatabase() {
    }

    @PostConstruct
    private void populateDatabase() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("./src/main/resources/tasklist.json");
        try {
            personDatabase = mapper.readValue(file, new TypeReference<HashMap<String, Person>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Map<String, Person> getAllTasks() {
        return personDatabase;
    }
}
