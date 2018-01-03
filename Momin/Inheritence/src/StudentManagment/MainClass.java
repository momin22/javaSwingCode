package StudentManagment;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		 Student ob=new Student();
		 System.out.println("Enter Student information: ");
	   
		 Scanner o= new Scanner(System.in);
		 String name=o.next();
		 ob.setName(name);
		 int id=o.nextInt();
		 ob.setId(id);
		 String address=o.next();
		 ob.setAddress(address);
		 String course=o.next();
		 ob.setCourse(course);
		 System.out.println(ob.toString());
		 StudentInfo obj = new StudentInfo();
		 obj.setDept(name);
		 String dept=o.next();
		  obj.setDept(dept);
		  System.out.println(obj.getDept());
		  
		 

	}

}
