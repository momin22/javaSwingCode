package comm.example;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        
        Scanner ob= new Scanner(System.in);
        System.out.println("please Enter the value \n");
        int id;
        String name, steam;
        id=ob.nextInt();
        name=ob.next();
        steam=ob.next();
        
        Student St= new Student(id,name,steam);
        System.out.println(St);
        Student.display();
        Student St1=new Student();
        Student.display();
        
    }
    
}
