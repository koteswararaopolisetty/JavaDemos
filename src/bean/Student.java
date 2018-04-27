package bean;

public class Student {
	private String name;
	private Enum Gender;
	public Student()//constructor
	{
		System.out.println("Student Called");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enum getGender() {
		return Gender;
	}
	public void setGender(Enum gender) {
		Gender = gender;
	}
	public Student(String name, Enum gender) {
		super();
		this.name = name;
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Gender=" + Gender + "]";
	}
	

}
