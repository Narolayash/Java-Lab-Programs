import java.util.Scanner;
public class P1B5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter meters :");
		double meter = sc.nextDouble();
		double feet = meter*3.28084;
		System.out.println(meter+" Meter = "+feet+" feet");
	}
}