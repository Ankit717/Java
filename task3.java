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
        System.out.println("Enter the number of minutes");
        String min = new String();
        Scanner s = new Scanner(System.in);
        min = s.nextLine();
        int years=0, days=0, min1;
        min1 = Integer.parseInt(min);
        if(min1 > 24*60*365){
            years = min1/(24*60*365);
            min1 = min1%(24*60*365) ;
        }
        if(min1 > 24*60){
            days = min1/(24*60);
            min1 = min1%(24*60) ;
        }
        System.out.println(min+" minutes is approximately "+years+" years and "+days+" days");
    }
    
}
