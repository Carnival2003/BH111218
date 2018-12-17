import java.util.Random;

public class HelloWorld {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt();
		System.out.println(x);
	if (x % 10 == 1) {
        System.out.println(x + " рубль");
    }
	else if (x % 10 < 5) {
		System.out.println(x + " рубля");
	}
	else if (x % 10 > 4) {
        System.out.println(x + " рублей");
    }
	else {
		System.out.println("Error");
	}
	}
}