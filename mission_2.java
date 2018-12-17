import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите любое число: ");
		int number = scan.nextInt();
		{
		if ( number > 99 & number < 1000) {
			System.out.println("Число является трехзначным");}
		else {
		    System.out.println ("Число не является трехзначным");}
		}
		{ 
			if (number % 10 == 7) {
            System.out.println("Последняя цифра является 7");
            }
		else {
            System.out.println("Последняя цифра не равна 7");
            }
		}
		{ 
			if (number % 2 == 0) {
            System.out.println("Число четное");
        }
		else {
            System.out.println("Число не четное");
        }
		}
	}
}