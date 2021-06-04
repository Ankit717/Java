/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;


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
         int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
         int b[][]={{1,3,4},{2,4,3},{1,2,4}};
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 int temp = a[i][j]+b[i][j];
                 System.out.print(temp+" ");
             }
         }
    }
}
    
