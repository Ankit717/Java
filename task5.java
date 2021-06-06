/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;

import java.util.Scanner;
/**
 *
 * @author ankit
 */
public class NewClass {
    
    public static void main(String[] args){
        Employee[] arr = new Employee[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the name");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            System.out.println("Enter the year of joining");
            Scanner sc1 = new Scanner(System.in);
            String str1 = sc1.nextLine();

            System.out.println("Enter the salary");
            Scanner sc2 = new Scanner(System.in);
            String str2 = sc2.nextLine();

            System.out.println("Enter the address");
            Scanner sc3 = new Scanner(System.in);
            String str3 = sc3.nextLine();
            arr[i] = new Employee(str,str1,str2,str3);
        }
        for(int i=0;i<3;i++){
            arr[i].output();
        }
    }
}
class Employee {
    public String name,year,salary,address;
    Employee(String name,String year,String salary,String address)
    {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }
    
    public void output(){
        System.out.println("Name Year of joining Address "+name+" "+year+" "+salary+" "+address);
        System.out.println();
    }
}
