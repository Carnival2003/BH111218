import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int sec = 4500;
		int min = sec / 60;
		int secRest = sec % 60;
		System.out.println(sec + " seconds is: " + min + " minutes and " + secRest + " seconds.");
		int hourB = sec / 3600;
		int minB = min % 60;
		int secB = secRest % 60;
		System.out.println(sec + " seconds is: " + hourB + " hour and " + minB + " minutes and " + secB + " seconds.");
		int dayC = hourB / 24;
		int hourC = hourB % 24;
		int minC = min % 60;
		int secC = secRest % 60;
		System.out.println(sec + " seconds is: " + dayC + " day and " + hourC + " hour and " + minC + " minutes and "
				+ secC + " seconds.");
		int weekD = dayC / 7;
		int dayD = hourB / 24;
		int hourD = hourB % 24;
		int minD = minB % 60;
		int secD = secB % 60;
		System.out.println(sec + " seconds is: " + weekD + " week and " + dayD + " day and " + hourD + " hour and "
				+ minD + " minutes and " + secD + " seconds.");
	}
}