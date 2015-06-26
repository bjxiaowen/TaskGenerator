package com.bp3.TaskGenerator.model;

import java.util.Date;

/**
 * Created by afahsl on 6/8/15.
 */
public class Task {

    private String description;
    private String name;
    private Long process_id;
    private Long instance;
    private String task_id;
    private String status;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProcess_id() {
        return process_id;
    }

    public void setProcess_id(Long process_id) {
        this.process_id = process_id;
    }

    public Long getInstance() {
        return instance;
    }

    public void setInstance(Long instance) {
        this.instance = instance;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", process_id=" + process_id +
                ", instance=" + instance +
                ", task_id='" + task_id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
