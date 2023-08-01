package forloop1homework;

import java.util.Scanner;

public class NoToWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String input = sc.nextLine();

		String wordRepresentation = convertNumberToWord(input);
		System.out.println("Word : " + wordRepresentation);
	}

	public static String convertNumberToWord(String input) {
		String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		int number = Integer.parseInt(input);

		if (number == 0) {
			return "zero";
		} else if (number < 20) {
			return units[number];
		}

		String word = "";
		if (number >= 100) {
			word += units[number / 100] + " hundred ";
			number %= 100;
		}
		if (number >= 20) {
			word += tens[number / 10] + " ";
			number %= 10;
		}
		if (number > 0) {
			word += units[number];
		}

		return word;
	}

}
