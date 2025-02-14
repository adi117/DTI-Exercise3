package org.example;

import org.example.entity.User;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Auth auth = new Auth();
    private static User currentUser = null;

    public static void main(String[] args) {
        System.out.println("--- Task Management System ---");
        try {
            while (true){
                while(currentUser == null){
                    System.out.print("Input your username : ");
                    String username = scanner.nextLine();
                    System.out.print("Type your password : ");
                    String password = scanner.nextLine();

                    if (!auth.checkUsername(username)){
                        System.out.println("No username registered! Register first!");
                        System.out.print("Register username : ");
                        username = scanner.nextLine();
                        System.out.print("Type new password : ");
                        password = scanner.nextLine();
                        auth.register(username, password);
                        continue;
                    }

                    currentUser = auth.login(username, password);

                }

                try{
                    System.out.println("--- Menu ---");
                    System.out.println("1. Add task");
                    System.out.println("2. Remove task");
                    System.out.println("3. View task");
                    System.out.println("q. Quit system");
                    System.out.print("Choose menu : ");
                    String menu = scanner.nextLine();
                    String task;

                    try{
                        int menuInt = Integer.parseInt(menu);

                        switch (menuInt){
                            case 1 :
                                System.out.print("Type your task : ");
                                task = scanner.nextLine();
                                TaskManagement.addTask(currentUser, task);
                                break;
                            case 2 :
                                TaskManagement.viewTask(currentUser);
                                System.out.print("Task want to remove / done : ");
                                task = scanner.nextLine();
                                TaskManagement.removeTask(currentUser, task);
                                break;
                            case 3 :
                                TaskManagement.viewTask(currentUser);
                                break;
                            default:
                                System.exit(0);
                                break;
                        }
                    } catch (Exception e){
                        System.out.println("Input should be a number!");
                    }
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
        } finally {
            scanner.close();
        }



    }
}