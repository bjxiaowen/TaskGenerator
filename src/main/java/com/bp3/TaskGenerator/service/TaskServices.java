package com.bp3.TaskGenerator.service;

import com.bp3.TaskGenerator.model.Task;
import com.bp3.TaskGenerator.repo.TaskDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by afahsl on 6/8/15.
 */
@Service
public class TaskServices {

    @Autowired
    TaskDatabase taskDatabase;

    public List<Task> getAllTasks(){
        return taskDatabase.getAllTasks();
    }

}
