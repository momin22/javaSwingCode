/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapply;

import java.util.Scanner;

/**
 *
 * @author ETS
 */
public class ArrayApply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] tmp1 = null;
        int[][] tmp2 = null;
        int s1,s2,i,j;
        System.out.println("Enter Array Row Size :__");
        
            s1 = sc.nextInt();
            
         System.out.println("Enter Array Colom Size :__");
            s2 = sc.nextInt();
            tmp1 = new int[s1][s2];
             tmp2 = new int[s1][s2];
         System.out.println("Enter First Array Value :__");
            for(i=0;i<s1;i++){
                for(j=0;j<s2;j++){
                    tmp1[i][j]=sc.nextInt();
                }
            }
            
            System.out.println("Enter Second Array Value :__");
            for(i=0;i<s1;i++){
                for(j=0;j<s2;j++){
                    tmp2[i][j]=sc.nextInt();
                }
            }
            ArrayWork ak = new ArrayWork(s1,s2);
            ak.ArrayAdd(tmp1, tmp2);
            ak.Display();
            
    }
    
}
