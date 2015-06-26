package com.bp3.TaskGenerator.repo;

import com.bp3.TaskGenerator.model.Task;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Repository
public class TaskDatabase {

    Map<String, Task> taskDatabase;
    Map<String, Task> finishedTaskDatabase;


    public TaskDatabase() {
    }

    @PostConstruct
    private void populateDatabase() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("./src/main/resources/tasklist.json");
        try {
            taskDatabase = mapper.readValue(file, new TypeReference<HashMap<String, Task>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostConstruct
    private void populateFinishedDatabase() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("./src/main/resources/finishedlist.json");
        try {
            finishedTaskDatabase = mapper.readValue(file, new TypeReference<HashMap<String, Task>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Map<String, Task> getAllTasks() {
        return taskDatabase;

    }

    public Map<String, Task> getFinishedTasks() {
        return finishedTaskDatabase;
    }

    public void removeTask(String task_ID) {
        Iterator<Map.Entry<String, Task>> iterator = taskDatabase.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Task> taskEntry = iterator.next();

            if (taskEntry.getValue().getTask_id().equals(task_ID)){
                taskEntry.getValue().setStatus("Closed");
                String key = String.valueOf(finishedTaskDatabase.size());
                finishedTaskDatabase.put(key,taskEntry.getValue());
                iterator.remove();
                System.out.println(key);
                System.out.println(taskEntry.getValue().toString());
            }
        }
    }

}
