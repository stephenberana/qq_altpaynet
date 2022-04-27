/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaactivitybootcamp;

import com.mycompany.javaactivitybootcamp.model.User;
//import java.awt.TextField;
import java.util.Scanner;


/**
 *
 * @author Stephen
 */
public class JavaActivityBootcamp {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to my shop! \n"
                            + "1 - Login \n" 
                            + "0 - Exit \n");
        System.out.print("What do you want to do? : ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            switch (input) {
             case 1: 
                System.out.println("LOGIN \n"
                        + "Enter your username and password to continue. \n");
                System.out.print("Username: ");
                String username = scanner.next(); 
                System.out.print("Password: ");
                String password = scanner.next();
//                TextField password = new TextField(8);
//                password.setEchoChar('*');
//                User login = new User(setUsername, setPassword);
                break;
             case 0: 
                 System.out.println("Logging out.");
             default:
                 System.out.println("Please enter only 0 or 1.");
        }
    }
 }
    
}
