// Declare a class called Student having following data members:id_no, 
// no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
// Define constructor and calculate_spi methods. Define main to instantiate an array for 
// objects of class student to process data of n students to be given as command line 
// arguments. [A] 

import java.util.Scanner;

class Student {
	int id_no;
	int no_of_subject_registered;
	String subject_code;
	int[] subject_credits;
	char[] grade_obtained;
	double spi;

	public Student(int id_no, int no_of_subject_registered, String subject_code, int[] subject_credits, char[] grade_obtained) {
		this.id_no = id_no;
		this.no_of_subject_registered = no_of_subject_registered;
		this.subject_code = subject_code;
		this.subject_credits = subject_credits;
		this.grade_obtained = grade_obtained;
	}

	public double calculate_spi() {
		int total_point = 0, total_credits = 0;
		for (int i = 0; i < no_of_subject_registered; i++){
			total_credits += subject_credits[i];
			total_point = subject_credits[i] * grade_point(grade_obtained[i]);
		}

		return ((double)total_point / total_credits);
	}

	public int grade_point(char g){
		if (g == 'A'){
			return 10;
		}
		else if (g == 'B'){
			return 9;
		}
		else if (g == 'C'){
			return 8;
		}
		else if (g == 'D'){
			return 7;
		}
		else if (g == 'E'){
			return 6;
		}
		else if (g == 'F'){
			return 5;
		}
		else if (g == 'G'){
			return 4;
		}
		else {
			return 3;
		}
	}
}
public class P7A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter ID No. :");
	int id_no = sc.nextInt();

	System.out.println("Enter Number of Subject :");
	int no_of_subject_registered = sc.nextInt();

	System.out.println("Enter Subject Codes :");
	String subject_code = sc.next();

	System.out.println("Enter Credits :");
	int[] subject_credits = new int[no_of_subject_registered];

	for(int i = 0; i < no_of_subject_registered; i++){
		System.out.println("Enter Credits of Subject "+(i+1)+" :");
		subject_credits[i] = sc.nextInt();
	}
	char[] grade_obtained = new char[no_of_subject_registered];
	for(int i = 0; i < no_of_subject_registered; i++){
		System.out.println("Enter Grede of Subject "+(i+1)+" :");
		grade_obtained[i] = sc.next().charAt(0); 
	}

	Student s1 = new Student (id_no, no_of_subject_registered, subject_code, subject_credits, grade_obtained);
	s1.spi = s1.calculate_spi();

	System.out.println("spi = "+ s1.spi);
	}
}