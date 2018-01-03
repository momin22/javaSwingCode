package StudentManagment;

public class Student {
	private int Id;
	 private String name;
	 private String address;
	 private String course ;
 public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", address=" + address + ", course=" + course + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getCourse()="
				+ getCourse() + "]";
	}
	
	


}
