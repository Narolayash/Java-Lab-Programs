import java.util.Scanner;

class Prime{
	void primeRange(int a, int b){
		for(int n = a ; n <= b ; n++){
			boolean flag=false;
			for(int i=2; (i*i)<n ; i++){
				if(n%i==0){
				flag=true;
				break;
				}
			}
			if(flag==false){
				System.out.print(n+" ");
			}
		}
	}
}

public class P3C8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range of number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Prime num = new Prime();
		num.primeRange(a,b);
	}
}