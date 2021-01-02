package xyz.pakwo;

import xyz.pakwo.service.Calculator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int a = 3;
		int b = 7;
		int result = calculator.add(a, b);
		System.out.printf("%d + %d = %d", a, b, result);
	}
}
