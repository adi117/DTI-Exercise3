package org.example.entity;

public class User {

    private final String username;
    private final String password;
    private final ToDoList toDoList;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.toDoList = new ToDoList();
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String password){
        return this.password.equals(password);
    }

    public ToDoList getToDoList(){
        return toDoList;
    }
}
