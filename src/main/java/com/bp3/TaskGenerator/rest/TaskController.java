package com.bp3.TaskGenerator.rest;

import com.bp3.TaskGenerator.model.Task;
import com.bp3.TaskGenerator.service.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by afahsl on 6/9/15.
 */
@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskServices taskServices;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Task> getAllTasks() {
        return taskServices.getAllTasks();

    }
}
