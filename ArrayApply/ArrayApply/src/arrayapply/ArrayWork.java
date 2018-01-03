/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapply;


public class ArrayWork {
     int[][] m1=null;
        int[][] m2=null;
        int[][] m3=null;
         int[][] m4=null;
          int[][] m5=null;
          int x1,y1;
        
        
        ArrayWork(int s1,int s2){
            m1= new int[s1][s2];
            m2= new int[s1][s2];
            m3= new int[s1][s2];
            m4= new int[s1][s2];
            m5= new int[s1][s2];
            this.x1=s1;
            this.y1=s2;
        }
        
        public void ArrayAdd(int[][] x, int[][] y){
             m1=x;
             m2=y;
            for(int i=0;i<x1;i++){
                for(int j=0;j<y1;j++){
                    m3[i][j]=m1[i][j]+m2[i][j];
                     m4[i][j]=m1[i][j]-m2[i][j];
                      m5[i][j]=m1[i][j]*m2[i][j];
                }
            }
            
        }
    public void Display(){
       
        System.out.println("Print Array Addition Result :");
            for(int i=0;i<x1;i++){
                for(int j=0;j<y1;j++){
                    System.out.println(m3[i][j]);
                }
            }
            System.out.println("Print Array Substraction Result :");
             for(int i=0;i<m4.length;i++){
                for(int j=0;j<m4.length;j++){
                    System.out.println(m4[i][j]);
                }
            }
             System.out.println("Print Array Multipltion Result :");
              for(int i=0;i<m5.length;i++){
                for(int j=0;j<m5.length;j++){
                    System.out.println(m5[i][j]);
                }
            }
    }
}
