import java.util.Scanner;
public class P2A3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre the lenght :");
		double l = sc.nextDouble();
		if(l<0){
			System.out.print("Invalid Input ");
		}
		else{
			System.out.print("Entre the widht :");
			double b = sc.nextDouble();
			if(b<0){
				System.out.print("Invalid Input ");
			}
			else{
				double area = l*b;
				System.out.println("Area of Rectenagle is "+area);
			}
		}
	}
}