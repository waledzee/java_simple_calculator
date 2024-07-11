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

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // ask user about operation
        System.out.println("Enter the num of operation");
        System.out.println("1-sum /n 2-sub /n 3-divtion /n 4-multiplication");
        // sum
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        if(choice ==1)
        {
            int n1,n2;
            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);

            n1 = num1.nextInt();
            n2 = num2.nextInt();
            
            System.out.println(n1+n2);
            
        }else if (choice==2)
        {
            int n1,n2;
            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);

            n1 = num1.nextInt();
            n2 = num2.nextInt();
            
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
