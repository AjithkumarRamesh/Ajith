package forloop1homework;

import java.util.Scanner;

public class PrintNoWithoutloop {
	public static void printNumbers(int first, int last) {
		if (first <= last) {
			System.out.println(first);
			printNumbers(first + 1, last);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number :");
		int a = sc.nextInt();
		System.out.print("Enter Second number :");
		int b = sc.nextInt();
		printNumbers(a, b);

	}
}
