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
public class Sample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pick one: \t1. Hi\t2. Hey\t3. Hello\t");
        int choise;
        Scanner s = new Scanner(System.in);
        choise = s.nextInt();
        switch(choise){
            case 1 : System.out.println("You said Hi");
                    break;
            case 2 : System.out.println("You said Hey");
                    break;
            case 3 : System.out.println("You said Hello");
                    break;
            default : System.out.println("Invalid");
        }
    }
    
}
