 import java.util.Scanner;
public class P2B4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the temperature from Fahrenheit :");
		double fahrenheit = sc.nextDouble();
		double celsius =(fahrenheit-32)*(5.0/9);
		System.out.println(fahrenheit+" fahrenheit = " +celsius+" celsius" );
	}
}
