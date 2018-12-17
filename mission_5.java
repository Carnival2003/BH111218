import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите натуральное 4-ех значное число: ");
		int number = scan.nextInt();
		{
		if ( number > 999 & number < 10000) {
			int n1 = 0;
			while(number != 0){
			     n1 = n1*10 + number%10;
			     number /= 10;
			}
			System.out.println(n1);
			}
		else {
		    System.out.print("Число не является 4-ех значным");}
		}
	}
}