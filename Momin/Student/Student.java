
package comm.example;
public class Student extends Object{
        private int id;
private String name;
private String  Department;
private static int count;
static {
    count=0;
}
public  Student(){
    super();
    count++;
}
    public Student(int id, String name, String Department) {
        super();
        this.id = id;
        this.name = name;
        this.Department = Department;
    }
    public static void display(){
        System.out.println("cout:"+count);
    }
    @Override
    public String toString() {
        return "Student{" + " \n id=" + id + ", \nname=" + name + ", \n Department= " + Department+"\n"+'}';
    }
    

    
}
