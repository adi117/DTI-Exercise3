package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Auth auth = new Auth();
    private static User currentUser = null;

    public static void main(String[] args) {
        while (true){
            while(currentUser == null){
                System.out.print("Input your username : ");
                String username = scanner.nextLine();
                System.out.print("Type your password : ");
                String password = scanner.nextLine();
                System.out.println();

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
        }
    }
}