package org.example;

import org.example.entity.User;

import java.util.HashMap;

public class Auth {
    private HashMap<String, User> userList;

    public Auth(){
        userList = new HashMap<>();
        userList.put("admin", new User("admin", "admin"));
        userList.put("user1", new User("user1", "12345"));
        userList.put("sun", new User("user2", "flower"));
    }

    public void register(String username, String password){
        if (userList.containsKey(username)){
            System.out.println("Username already used / registered!");
        }
        userList.put(username, new User(username, password));
        System.out.println("User registered successfully!");
    }

    public User login(String username, String password){
        User user = userList.get(username);
        if (user != null && user.validatePassword(password)){
            System.out.println("Login success! Welcome " + user.getUsername());
            return user;
        }
        System.out.println("Invalid username or password!");
        return null;
    }

    public boolean checkUsername(String username){
        if (userList.get(username) != null){
            return true;
        }
        return false;
    }
}
