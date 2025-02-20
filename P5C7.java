import java.util.Scanner;
public class P5C7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array :");
		int size = sc.nextInt();

		int[] nums = new int[size];
		System.out.println("");

		for(int i=0 ; i<size ; i++){
			System.out.print("Enter the number["+i+"] :");
			nums[i] = sc.nextInt();
		}
		System.out.println("");

		System.out.print("Array is :");
		for(int i=0 ; i<size ; i++){ 
			System.out.print(nums[i]+" ");
		}

		System.out.println("");
		System.out.print("Enter the index :");
		int index = sc.nextInt();

		int[] newnNums = new int[size];
		for(int i=index,j=0 ; i<size ; i++,j++){
			newnNums[j] = nums[i];
		}
		for(int i=0,j=size-index ; i<index ; i++,j++){
			newnNums[j] = nums[i];
		}

		System.out.print("New Array is :");
		for(int i=0 ; i<size ; i++){
			System.out.print(newnNums[i]+" ");
		}

		System.out.println("");
		System.out.print("Enter the target element :");
		int target = sc.nextInt();
		int found = 0;

		for(int i=0 ; i<size ; i++){
			if(newnNums[i]==target){
				found = i;
				break;
			}
		}
		System.out.println("");

		if(found>0){
			System.out.print("Target Number is index number :"+found);
		}
		else{
			System.out.println("-1");
		}
	}
}
