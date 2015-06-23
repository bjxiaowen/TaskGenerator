package com.bp3.TaskGenerator.repo;

import com.bp3.TaskGenerator.model.Task;
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
public class TaskDatabase {

    Map<Long, Task> taskDatabase;

    public TaskDatabase() {
    }

    @PostConstruct
    private void populateDatabase() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/taskList.json");
        try {
            taskDatabase = mapper.readValue(file, new TypeReference<HashMap<Long, Task>>() {});
        } catch (IOException e) {
            System.out.println("ERROR:");
            e.printStackTrace();
        }
    }


    public List<Task> getAllTasks(){
        return new ArrayList<>(taskDatabase.values());
    }
}
