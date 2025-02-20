 import java.util.Scanner;
public class P3B6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year :");
		int year = sc.nextInt();
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.print("Leap year");
				}
				else{
					System.out.print("Not Leap year");
				}
			}
			else{
				System.out.print("Leap Year");
			}
		}
		else{
			System.out.print("Not Leap Year ");
		}
	}
}