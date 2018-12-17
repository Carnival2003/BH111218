//1

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите 2 любых целых числа: ");
		int number1 = k.nextInt();
		int number2 = k.nextInt();
		int summa = number1 + number2;
		System.out.println("Сумма: " + summa);
		System.out.println("Произведение: " + number1 * number2);
	}
}

//2

import java.util.Scanner;

public class Task1 {
	public static void main (String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите число: ");
		int number1 = k.nextInt();
	    int step = 3;
	    System.out.printf("Число в кубе равно: " + Math.pow(number1, step));
	}
}

//3

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите 3 любых целых числа: ");
		int number1 = k.nextInt();
		int number2 = k.nextInt();
		int number3 = k.nextInt();
		int a = number1 * 2;
	    int b = number2 - 3;
	    int step = 2;
	    int c = (int) Math.pow(number3, step);
	    int summa = a + b + c;
	    System.out.println("Сумма: " + summa); 
	}
}

//4

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите 3 любых целых числа: ");
		int number1 = k.nextInt();
		int number2 = k.nextInt();
		int number3 = k.nextInt();
		int arif = (number1 + number2 + number3) / 3;
		int razn = 2 * (number1 + number3) - 3 * number2;
		System.out.println("Среднее арифмитическое: " + arif + " Разность: " + razn);
	}
}

//5

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите 3 любых целых числа: ");
		int number1 = k.nextInt();
		int per = number1 * 4;
		int pl = number1 * number1;
		System.out.println("Периметр: " + per + " Площадь: " + pl);
	}
}

//6

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите цену  за 1 кг конфет: ");
		int number1 = k.nextInt();
		System.out.println("Введите цену  за 1 кг печенья: ");
		int number2 = k.nextInt();
		int pok1 = ((number1/1000)*300) + ((number2/1000)*400);
		int pok3 = (number2*2) + number1 + ((number1/1000) * 800);
		System.out.println("Покупка 300 г конфет и 400 г печенья: " + pok1);
		System.out.println("Три покупки, каждая из 2 кг печенья и 1 кг 800 г конфет. " + pok3);
	}
}

//7

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите время в минутах: ");
		int number1 = k.nextInt();
		System.out.println("Введите расстояние в километрах: ");
		int number2 = k.nextInt();
		int a = number1 * 60;
		int b = number2 * 1000;
		int c = b / a;
		System.out.println("Скорость " + c);
	}
}

//8

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите время в минутах: ");
		int a = k.nextInt();
		System.out.println("Введите расстояние в километрах: ");
		int b = k.nextInt();
		double c = (double) Math.sqrt((a * a) + (b * b));
		double per = a + b + c;
		int pl = (a * b) / 2;
		System.out.println("Гипотенуза равна: " + c + ", периметр равен: " + per + ", площадь равна: " + pl);
	}
}

//9

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите температуру в градусах Цельсия: ");
		int a = k.nextInt();
		int f = (a * (9 / 5)) + 32;
		System.out.println("Температуру в градусах Фаренгейта: " + f);
	}
}

//10

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите кг конфет: ");
		int number1 = k.nextInt();
		System.out.println("Введите цену  за кг конфет: ");
		int number2 = k.nextInt();
		System.out.println("Введите сколько нужно кг конфет: ");
		int number3 = k.nextInt();
		System.out.println("Введите кол-во денег: ");
		int number4 = k.nextInt();
		int price = number2 / number1;
		int price2 = number3 * price;
		int kg =  number4 / price;
		System.out.println("Один килограмм стоит: " + price);
		System.out.println(number3 + " кг, будет стоить: " + price2);
		System.out.println("За " + number4 + " рублей, можно купить " + kg + " кг конфет");
	}
}

//11

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите количество дней: ");
		int day = k.nextInt();
		System.out.println("Введите процент скидки: ");
		int proc = k.nextInt();
		System.out.println("Введите сумму: ");
		int summa = k.nextInt();
		int profit = (summa + (3 * day)) * (1 + (proc/100));
		System.out.println("Прибыль: " + profit);
	}
}

//12

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите кол-во недель: ");
		int ned = k.nextInt();
		System.out.println("Введите кол-во месяцев: ");
		int mes = k.nextInt();
		System.out.println("Введите кол-во лет: ");
		int god = k.nextInt();
		int dni = (ned * 7) + (mes * 30) + (god * 360);
		System.out.println("Кол-во дней за этот период: " + dni);
	}
}

//13

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите число a: ");
		int a = k.nextInt();
		System.out.println("Введите число b: ");
		int b = k.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("Число a: " + a);
		System.out.println("Число b: " + b);
	}
}

//14

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите число a: ");
		int a = k.nextInt();
		System.out.println("Введите число b: ");
		int b = k.nextInt();
		System.out.println("Введите число c: ");
		int c = k.nextInt();
		int d = a;
		int e = b;
		int j = c;
		a += b;
		b = c - d;
		c = d + e + j;
		System.out.println("Число а: " + a + ", число b: " + b + ", число с: " + c);
	}
}

//15

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Введите сумму: ");
		int s = k.nextInt();
		System.out.println("Введите проценты: ");
		int p = k.nextInt();
		double s1 = s * (1 + 0.01 * p) * 5;
		double s2 = s + 5 * s * 0.01 * p;
		System.out.println("Сумма + проценты: " + s1);
		System.out.println("Сумма + проценты - прибыль: " + s2);
	}
}

//16

