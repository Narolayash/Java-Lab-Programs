// Write a program to create circle class with area function to find area of circle.

import java.lang.Math;
import java.util.Scanner;

class Circle{
	double redius;

	public void areaOfCircle(){
		double area = Math.PI * redius * redius;
		System.out.println("Area of the Circle is "+area);
	}

	public Circle(double redius){
		this.redius = redius;
	}
}

public class P6A1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the redius of the circle :");
		
		double redius = sc.nextDouble();
		Circle c1 = new Circle(redius);
		c1.areaOfCircle();
	}
}