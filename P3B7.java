 import java.util.Scanner ;
public class P3B7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n = sc.nextInt();
		int org = n;
		int rev = 0;
		while(n!=0){
			rev = (rev*10) + (n%10);
			n/=10;
		}
		if(org == rev){
			System.out.print("Numbre is Palindrome ");
		}
		else{
			System.out.print("Number is Not Palindrome ");
		}
	}
}