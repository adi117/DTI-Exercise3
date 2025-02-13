package org.example;

public class TaskManagement {

    public static void addTask(User user, String task){
        user.getToDoList().addTask(task);
        System.out.println("Task successfully added!");
    }

    public static void  viewTask(User user){
        int numbering = 0;

        if (!user.getToDoList().taskList.isEmpty()){
            System.out.println("Your task : ");
            for(String task : user.getToDoList().taskList){
                numbering++;
                System.out.println(numbering + ". " + task);
            }
        } else {
            System.out.println("No task added!");
        }
    }

    public static void removeTask(User user, String task){
        user.getToDoList().removeTask(task);
    }
}
