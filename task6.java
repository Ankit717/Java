/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import java.util.Scanner;


/**
 *
 * @author ankit
 */


public class NewClass { 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any number");
        int num = sc.nextInt();
        int flag = 0;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
    } 
}
