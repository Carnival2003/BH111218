import java.util.Random;

public class HelloWorld {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(13);
		System.out.println(x);
		int a = x % 10;
		int b = (x / 10) % 10;
		if (a == 1 && b != 1) {
			System.out.println(x + " рубль");
		} else if (a > 4 && b == 1) {
			System.out.println(x + " рублей");
		} else if (a >= 0 && b == 1) {
			System.out.println(x + " рублей");
		} else if (a < 5) {
			System.out.println(x + " рубля");
		} else {
			System.out.println("Error");
		}
	}
}