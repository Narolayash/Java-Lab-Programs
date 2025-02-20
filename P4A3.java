import java.util.Scanner;
public class P4A3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n = sc.nextInt();
		int []ary = new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter the number "+(i+1)+ ":");
			ary[i]=sc.nextInt();
		}

		System.out.println("Reverse order :");
		for(int i=n-1;i>(-1);i--){
			System.out.println(ary[i]+" ");
		}
	}
}