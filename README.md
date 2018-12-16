
# BH111218
1. Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд: 
А) минут + секунд, 
В) часов + минут + секунд, 
С) дней + часов + минут + секунд, 
D) недель + дней + часов + минут + секунд. 


import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
			int sec = 4500;
			int min = sec/60;
			int secRest = sec%60;	
	System.out.println(sec + " seconds is: " + min +" minutes and " + secRest + " seconds.");
	        int hourB = sec/3600;
	        int minB = min%60;
	        int secB = secRest%60;
	System.out.println(sec + " seconds is: " + hourB +" hour and " + minB +" minutes and " + secB + " seconds.");
	        int dayC = hourB/24;
	        int hourC = hourB%24;
	        int minC = min%60;
	        int secC = secRest%60;
	System.out.println(sec + " seconds is: " + dayC +" day and " + hourC +" hour and " + minC +" minutes and " + secC + " seconds.");
            int weekD = dayC/7;
	        int dayD = hourB/24;
            int hourD = hourB%24;
            int minD = minB%60;
            int secD = secB%60;
System.out.println(sec + " seconds is: " + weekD +" week and " + dayD +" day and " + hourD +" hour and " + minD +" minutes and " + secD + " seconds.");
	}
}

2. Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя цифра семеркой. 
Определите, является ли число четным.

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

3. Имеется прямоугольное отверстие размерами а и b. Определить, можно ли его полностью закрыть круглой картонкой радиусом r.

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
		int d = (int) Math.sqrt((a*a)+(b*b));
		int e = r*2;
		if (e > d) {
			System.out.print("Можно закрыть");
		}
		else {
			System.out.print("Нельзя закрыть");
		}
	
	}
}

4. Имеется целове число (задать с помощью Random rand = new Random(); int x = rand.nextInt() ). Это число – количесво денег в рублях. 
Вывести это число, добавив к нему слово «рублей» в правильном падеже.

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

5. Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n. 

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

6. Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите натуральное 4-ех значное число: ");
		int number = scan.nextInt();
		{
		if ( number > 999 & number < 10000) {
			int d = number%10;
			number /= 10;
			int c = number%10;
			number /= 10;
			int b = number%10;
			number /= 10;
			int a = number%10;
			System.out.println(" 1 аргумент: " + a + "; 2 аргумент: " + b + "; 3 аргумент: " + c + "; 4 аргумент: " + d);	
			if (a != b & a != c & a != d & b != c & b != d & c != d) {
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
