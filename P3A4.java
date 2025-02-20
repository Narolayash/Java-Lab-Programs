import java.util.Scanner;
public class P3A4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = (a>b && a>c)?a:((b>a && b>c)?b:c);
		System.out.print(max +" is largest ");
	}
} 