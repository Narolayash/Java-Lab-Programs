import java.util.Scanner;
public class P4A1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string :");
		String str = sc.nextLine();
		int con = 0,vol = 0;
	    for(int i = 0; i<str.length();i++){
	    	char ch = str.charAt(i);
	    	// System.out.print(ch);
	    	if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
	    	 	vol++;
	    	}
	    	else if(ch==' '){
	    		continue;
	    	}
			else{
	    		con++;
	    	 }
	    }
	    System.out.println("Consont ="+con);
	    System.out.println("Vowel ="+vol);
	}
}