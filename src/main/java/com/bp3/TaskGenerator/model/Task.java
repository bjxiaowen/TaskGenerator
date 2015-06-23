package com.bp3.TaskGenerator.model;

/**
 * Created by afahsl on 6/8/15.
 */
public class Task {

    private String description;
    private String name;
    private Long process_id;
    private Long instance;
    private Long task_id;

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

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }
}
