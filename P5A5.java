import java.util.Scanner;
public class P5A5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = new String();
		System.out.print("Enter the String Name :");
		name = sc.nextLine();

		for(int i=0; i<name.length(); i++){
			for(int j=0; j<=i; j++){
				System.out.print(name.charAt(j));
			}
			System.out.println("");
		}
	}

}