package com.bp3.TaskGenerator.repo;

import com.bp3.TaskGenerator.model.Task;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TaskDatabase {

    Map<String, Task> personDatabase;

    public TaskDatabase() {
    }

    @PostConstruct
    private void populateDatabase() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("./src/main/resources/tasklist.json");
        try {
            personDatabase = mapper.readValue(file, new TypeReference<HashMap<String, Task>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Map<String, Task> getAllTasks() {
        return personDatabase;
    }
}
