package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public final List<String> taskList;

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
        return taskList;
    }
}
