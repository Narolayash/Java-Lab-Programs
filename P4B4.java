 import java.util.Scanner;
public class P4B4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String :");
		String str = sc.nextLine();

		int size = str.length();

		for(int i = size/2; i<size ;i++){
			System.out.print(str.charAt(i));
		}
	}
}