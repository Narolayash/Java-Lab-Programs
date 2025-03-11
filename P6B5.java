// Define class for Complex number with real and imaginary as data members. Create its 
// constructor, overload the constructors. Also define addition method to add two 
// complex objects.

class ComplexNumber{
	double realPart;
	double imgPart;

	public ComplexNumber(){
		realPart = 0;
		imgPart = 0;
	}

	public ComplexNumber(double realPart, double imgPart){
		this.realPart = realPart;
		this.imgPart = imgPart;
	}

	public void additionOfComplexNumber(ComplexNumber c){
		double realPart = this.realPart + c.realPart;
		double imgPart = this.imgPart + c.imgPart;
		System.out.println("Addition of give Complex Number is = "+ realPart +" + "+ imgPart + "i");
	}
}

public class P6B5{
	public static void main(String[] args){
		ComplexNumber c1 = new ComplexNumber(5, 6);
		ComplexNumber c2 = new ComplexNumber(10, 9);

		c1.additionOfComplexNumber(c2);
	}
}