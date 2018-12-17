import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите ширину прямоугольника: ");
		int a = scan.nextInt();
		System.out.print("Введите длину прямоугольника: ");
		int b = scan.nextInt();
		System.out.print("Введите радиус круга: ");
		int r = scan.nextInt();
		double d = (double) Math.sqrt((a * a) + (b * b));
		if (r * 2 > d) {
			System.out.print("Можно закрыть");
		} else {
			System.out.print("Нельзя закрыть");
		}

	}
}