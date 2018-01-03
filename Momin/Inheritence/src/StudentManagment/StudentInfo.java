package StudentManagment;

public class StudentInfo {
 private String dept;

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "StudentInfo [dept=" + dept  + super.toString() + "]";
}

}
