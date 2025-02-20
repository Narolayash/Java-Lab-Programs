import java.util.Scanner;
public class P4A2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n = sc.nextInt(),sum=0;
		int num[]=new int[n];
		for(int i = 0; i<n ; i++){
			System.out.print("Enter the number "+(i+1)+" :");
			num[i] = sc.nextInt();
			sum+=num[i];
		}

		double avg = (double)sum/n;
		System.out.println("Avg of Numbers is ="+ avg);
	}
}