import java.util.Scanner;
class P3A1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sub1=0,sub2=0,sub3=0,sub4=0,sub5=0;
		double per=0;

		System.out.print("Enter the marks of sub1 :");
		sub1 = sc.nextInt();
		if(sub1 < 0){
			System.out.println("Invalid Input ");
		}
		else{
			System.out.print("Enter the marks of sub2 :");
			sub2 = sc.nextInt();
			if(sub2 < 0){
				System.out.println("Invalid Input ");
			}
			else{
				System.out.print("Enter the marks of sub3 :");
				sub3 = sc.nextInt();
				if(sub3 < 0){
					System.out.println("Invalid Input ");	
				}
				else{
					System.out.print("Enter the marks of sub4 :");
					sub4 = sc.nextInt();
					if(sub4 < 0){
						System.out.println("Invalid Input ");	
					}
					else{
						System.out.print("Enter the marks of sub5 :");
						sub5 = sc.nextInt();
						if(sub5 < 0){
							System.out.println("Invalid Input ");
						}
						else{
							per = ((double)(sub1+sub2+sub3+sub4+sub5)/500)*100;
							System.out.println("Per is "+per);
						}
					}
				}
			}
		}
		if(per >= 60.0){
			System.out.print("First Divisin ");
		}
		else if(per >= 50 && per <=59){
			System.out.print("Second Divisin ");
		}
		else if(per >= 40 && per <=49){
			System.out.print("Third Divisin ");
		}
		else{
			System.out.print("Fail ");
		}
	}
}