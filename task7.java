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
        int first = 0,second = 1,third;
        System.out.print(first+" "+second);
        for(int i=0;i<10;i++){
            third = first+second;
            first = second;
            second = third;
            System.out.print(" "+third);
        }
    } 
}
