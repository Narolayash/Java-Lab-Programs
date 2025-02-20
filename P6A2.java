// Define Time class with constructor to initialize hour and minute. Also define addition 
// method to add two time objects.
import java.util.Scanner;

class Time {   
	int hour;
	int minute;

	public Time(int hour, int minute){
		this.hour = hour;
		this.minute = minute;
	}

	public void additionOfTime(Time t1,Time t2){  //using tow objects
		int minute =  t1.minute + t2.minute;
		int hour = t1.hour + t2.hour;
		if(minute >= 60){
			minute -= 60;
			hour ++;
		}
		System.out.println("hour = "+hour);
		System.out.println("minute = "+minute);
	}

	public void additionOfTime(Time t){   //using one object
		int minute = this.minute + t.minute;
		int hour = this.hour + t.hour;
		if(minute >= 60){
			minute -= 60;
			hour ++;
		}
		System.out.println("hour = "+hour);
		System.out.println("minute = "+minute);

	}
}

public class P6A2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Time t1 = new Time(5,30);
		Time t2 = new Time(8,30);

		t1.additionOfTime(t1, t2);
		t1.additionOfTime(t2);
	}
}
