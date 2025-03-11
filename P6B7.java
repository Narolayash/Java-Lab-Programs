class Student{
	String firstName;
	String middelName;
	String lastName;
	int rollNo;
	int age;


	public Student(String firstName, String middelName, String lastName, int rollNo, int ags){
		this.firstName = firstName;
		this.middelName = middelName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.age = age;
	}

	static void abc(){
		System.out.println(this.firstName);
	}
}

public class P6B7{
	public static void main(String[] args){
		Student s1 = new Student("Sakriya", "Miheer", "K", -1, 5);
		Student s2 = new Student("Kaddo", "Bhavalo", "C", -2, 6);


		s1.abc();
	}
}