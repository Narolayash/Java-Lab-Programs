import java.util.Scanner;
public class P3A5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		boolean flag=false;
		for(int i=2; (i*i)<n ; i++){
			if(n%i==0){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.print("Number is not Prime ");
		}
		else{
			System.out.print("Number is Prime ");
		}
	}
}