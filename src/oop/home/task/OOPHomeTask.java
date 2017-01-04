/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.home.task;

import java.util.Scanner;

/**
 *
 * @author Rahat
 */
public class OOPHomeTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.next();
        System.out.println("Enter the designation: ");
        String desig = input.next();
        System.out.println("Enter the age: ");
        int age = input.nextInt();
        System.out.println("Enter the salary: ");
        int salary = input.nextInt();
        Employee emp = new Employee();
        emp.name(name);
        emp.desig(name);
        emp.age(age);
        emp.salary(salary);
    }
    
}
