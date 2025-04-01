package BasicPrograms;

public class PalindromeNumber {

	public static void isPalindrome(int number) {

		int reminder = 0;
		int reversedNumber = 0;
		int originalNumber;

		originalNumber = number;

		while (number > 0) {
			reminder = number % 10;
			reversedNumber = (reversedNumber * 10) + reminder;
			number = number / 10;
		}

		if (originalNumber == reversedNumber) {
			System.out.println(originalNumber + " is a palindrome number");
		} else {
			System.out.println(originalNumber + " is not a palindrome number");
		}
	}

	public static void main(String[] args) {
		
		isPalindrome(15151);
		isPalindrome(11157);
		isPalindrome(575);
	}

}
