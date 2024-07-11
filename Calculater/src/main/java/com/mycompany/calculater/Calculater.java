/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculater;

import java.util.Scanner;

/**
 *
 * @author m
 */

public class Calculater {
    public static int sum(int n1, int n2)
        {
            return n1+n2;
        };
    public static int div(int n1, int n2)
        {
            return n1/n2;
        };
    public static int sub(int n1, int n2)
        {
            return n1-n2;
        };
    public static int multi(int n1, int n2)
        {
            return n1*n2;
        };

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // ask user about operation
        System.out.println("Enter the num of operation");
        System.out.println("1-sum \n2-sub \n3-divtion \n 4-multiplication");
        // sum
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        
        
        if(choice ==1)
        {
            System.out.println("Enter Two numbers");

           int n1 = scan.nextInt();
           int n2 = scan.nextInt();
            
            System.out.println(sum(n1,n2));
            
        }else if (choice==2)
        {
             System.out.println("Enter Two numbers");

           int n1 = scan.nextInt();
           int n2 = scan.nextInt();
            
            System.out.println(sub(n1,n2));
        }
        else if (choice==3)
        {
             System.out.println("Enter Two numbers");

           int n1 = scan.nextInt();
           int n2 = scan.nextInt();
            
            System.out.println(div(n1,n2));
        }
        else if (choice==4)
        {
             System.out.println("Enter Two numbers");

           int n1 = scan.nextInt();
           int n2 = scan.nextInt();
            
            System.out.println(multi(n1,n2));
        }
        else 
        {
            System.out.println("Wrong Choice");
        }
        
        //div
        //multiplication
        //sub
    }
    
}
