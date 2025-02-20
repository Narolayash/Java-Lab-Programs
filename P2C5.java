import java.util.Scanner;
public class P2C5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.print("Number "+a+" is largest ");
		}
		else if(b>a && b>c){
			System.out.print("Number "+b+" is largest ");
		}
		else{
			System.out.print("Number "+c+" is largest ");
		}
	}
}