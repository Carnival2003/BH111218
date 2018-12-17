import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите натуральное 4-ех значное число: ");
		int number = scan.nextInt();
		{
		if ( number > 999 && number < 10000) {
			int d = number%10;
			number /= 10;
			int c = number%10;
			number /= 10;
			int b = number%10;
			number /= 10;
			int a = number%10;
			System.out.println(" 1 аргумент: " + a + "; 2 аргумент: " + b + "; 3 аргумент: " + c + "; 4 аргумент: " + d);	
			if (a != b && a != c && a != d && b != c && b != d && c != d) {
				System.out.println("Все числа различны");
			}
			else {
				System.out.println("Числа не различны"); 
			}
			
		}
		else {
		    System.out.print("Число не является 4-ех значным");}
		}
	}
}