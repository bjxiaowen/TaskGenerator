package com.bp3.TaskGenerator.rest;

import com.bp3.TaskGenerator.model.Task;
import com.bp3.TaskGenerator.service.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by afahsl on 6/9/15.
 */
@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskServices taskServices;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Map<String, Task> getAllTasks() {
        return taskServices.getAllTasks();
    }

    @RequestMapping(value = "/finishedlist", method = RequestMethod.GET)
    public Map<String, Task> getFinishedTasks() {
        return taskServices.getFinishedTasks();
    }

    @RequestMapping(value = "/finishedlist", method = RequestMethod.POST)
    public Map<String, Task> getFinishedTasksPost() {
        return taskServices.getFinishedTasks();
    }

    @RequestMapping(value ="/remove", method = RequestMethod.POST)
    public void removeTask(@RequestParam(value="task_id", defaultValue = "0") String task_id){
        System.out.println("This is the task to be removed");
        taskServices.removeTask(task_id);

    }
}
