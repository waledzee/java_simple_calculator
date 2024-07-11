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
           int n1 = scan.nextInt();
           int n2 = scan.nextInt();
            
            System.out.println(sum(n1,n2));
            
        }else if (choice==2)
        {
            
           int n1 = scan.nextInt();
           int n2 = scan.nextInt();
            System.out.println(n1-n2);
        }
        else if (choice==3)
        {
            int n1,n2;
            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);

            n1 = num1.nextInt();
            n2 = num2.nextInt();
            
            System.out.println(n1/n2);
        }
        else if (choice==4)
        {
            int n1,n2;
            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);

            n1 = num1.nextInt();
            n2 = num2.nextInt();
            
            System.out.println(n1*n2);
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
