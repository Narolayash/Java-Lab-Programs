public class P6B6{
	static int count = 0;
	public P6B6(){
		count++;
	} 

	public static void main(String[] args){
		P6B6 o1 = new P6B6();
		P6B6 o2 = new P6B6();

		System.out.println("Number of Object is "+ count);

	}
}