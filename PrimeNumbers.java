package BasicPrograms;

public class PrimeNumbers {
	
//		Is a given number prime or not
	public static boolean isPrime(int number) {
		
//		corner cases
		if(number <= 1) {
			return false;
		}
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

//		Print all the prime numbers between 1 and number
	public static void getPrimeNumbers(int number) {
		System.out.println("The prime numbers upto " + number + " are: ");
		for(int i = 2; i <= number; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("2 is a prime number: " + isPrime(2));
		System.out.println("17 is a prime number: " + isPrime(17));
		System.out.println("0 is a prime number: " + isPrime(0));
		System.out.println("-3 is a prime number: " + isPrime(-3));
		System.out.println("10 is a prime number: " + isPrime(10));
		
		getPrimeNumbers(10);
		getPrimeNumbers(2);
		
	}

}
