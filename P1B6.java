import java.util.Scanner;
public class P1B6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character :");
		char l = sc.next().charAt(0);
		if(l >= 'A' && l <= 'Z' || l >='a' && l<='z'){
			if(l == 'a' || l == 'e' || l == 'u' || l == 'i' || l == 'o'  || l == 'A' || l == 'E' || l == 'U' || l == 'I' || l == 'O'){
				System.out.print("Enter character is vowel");
			}
			else{
				System.out.print("Enter character is Constant");
			}
		}
		else{
			System.out.println("Invaid Input ");
		}
	}
}