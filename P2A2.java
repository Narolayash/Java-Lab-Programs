import java.util.Scanner;
public class P2A2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the equation");
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();

		if(op.equals("+")){
			System.out.print(a+b);
		}
		else if(op.equals("-")){
			System.out.print(a-b);
		}
		else if(op.equals("*")){
			System.out.print(a*b);
		}
		else if(op.equals  ("/")){
			System.out.print(a/b);
		}
		else{
			System.out.print("Invalid Opration ");		
		}
	}
}