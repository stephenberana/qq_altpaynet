/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaactivitybootcamp;

import com.mycompany.javaactivitybootcamp.model.User;
import java.util.ArrayList;
import java.util.List;
//import java.awt.TextField;
import java.util.Scanner;


/**
 *
 * @author Stephen
 */
public class JavaActivityBootcamp {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
                        System.out.println("***********************");
                        System.out.println("* Welcome to my shop! *");
                        System.out.println("***********************");
                        System.out.println("1 - Login");
                        System.out.println("***********************");
                        System.out.println("0 - Exit \n");
                        System.out.print("What do you want to  do? : ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            switch (input) {
             case 1: 
                User user = new User();
                System.out.println("LOGIN \n"
                        + "Enter your username and password to continue. \n");
                System.out.print("Username: ");
                String username = scanner.next();
                user.setUsername(username);
                System.out.print("Password: ");
                String password = scanner.next();
                user.setPassword(password);
                users.add(user);
                System.out.println("Please select user type. \n"
                            + "0 - Admin \n" 
                            + "1 - Customer \n");
                Scanner scanner2 = new Scanner(System.in);
                if (scanner2.hasNextInt()) {
                    int loginput = scanner2.nextInt();
                    switch (loginput) {
                    case 0:
                    System.out.println("Logged in as admin. \n");  
                    System.out.println("***********************");
                    System.out.println("*       ADMIN         *");
                    System.out.println("***********************");
                    System.out.println("1 - Manage products");
                    System.out.println("2 - Manage orders");
                    System.out.println("***********************");
                    System.out.println("0 - Logout");
                    Scanner admin1 = new Scanner(System.in);
                        if (admin1.hasNextInt()) {
                            int adminlog1 = admin1.nextInt();
                            switch (adminlog1) {
                                case 1:  
                                System.out.println("***********************");
                                System.out.println("*       PRODUCTS      *");
                                System.out.println("***********************");
                                System.out.println("<Product list here>");
                                System.out.println("***********************");
                                System.out.println("0 - Back");
                                System.out.println("1 - Add new product");
                                System.out.println("2 - Remove product");
                                break;
                                case 2:
                                System.out.println("***********************");
                                System.out.println("*       ORDERS      *");
                                System.out.println("***********************");
                                System.out.println("<Order list here>");
                                System.out.println("***********************");                         
                                System.out.println("1 - Mark order as delivered.");
                                System.out.println("0 - Back");
                                default: 
                                System.out.println("***********************");
                                System.out.println("*       ADMIN         *");
                                System.out.println("***********************");
                                System.out.println("1 - Manage products");
                                System.out.println("2 - Manage orders");
                                System.out.println("***********************");
                                break;
                            }
                        }
                        break;
                    case 1:
                    System.out.println("Logged in as customer. \n");    
                    System.out.println("***********************");
                    System.out.println("*       CUSTOMER      *");
                    System.out.println("***********************");
                    System.out.println("1 - Shop");
                    System.out.println("2 - My Orders");
                    System.out.println("***********************");
                    System.out.println("0 - Logout");
                    Scanner cust1 = new Scanner(System.in);
                        if (cust1.hasNextInt()) {
                            int custlog1 = cust1.nextInt();
                            switch(custlog1) {
                                case 1:
                                System.out.println("***********************");
                                System.out.println("*       SHOP      *");
                                System.out.println("***********************");
                                System.out.println("<Product list here>");
                                System.out.println("***********************");
                                System.out.print("0 - Back");
                                case 2:
                                System.out.println("***********************");
                                System.out.println("*       MY ORDERS      *");
                                System.out.println("***********************");
                                System.out.println("<Order list here>");
                                System.out.println("***********************");
                                System.out.print("Press 'ENTER' to continue.");
                                Scanner enter = new Scanner(System.in);
                                enter.nextLine();
                                break;
                                default:    
                                System.out.println("***********************");
                                System.out.println("*       CUSTOMER      *");
                                System.out.println("***********************");
                                System.out.println("1 - Shop");
                                System.out.println("2 - My Orders");
                                System.out.println("***********************");
                                System.out.println("0 - Logout");   
                            }
                        }
                    }   
                }
                break;
             case 0: 
                 System.out.println("Logging out.");
                 break;
             default:
                 System.out.println("Please enter only 0 or 1.");
                 break;
        }
     }
   }      
}
    
