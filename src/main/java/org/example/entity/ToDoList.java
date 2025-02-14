package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final List<String> taskList;

    public ToDoList(){
        this.taskList = new ArrayList<>();
    }

    public void addTask(String task){
        taskList.add(task);
    }
    public void removeTask(String task){
        taskList.remove(task);
    }
    public List<String> getTaskList(){
        return new ArrayList<>(taskList);
//        Return copy of actual list to prevent mutable list
    }
}
