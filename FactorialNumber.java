package BasicPrograms;

public class FactorialNumber {
	
//		using for loop
	public static int findFactorial(int number) {
		int factNum = 1;
		if(number == 0)
			return 1;
		for(int i = number; i > 0; i--) {
			factNum = factNum * i;
		}
		return factNum; 
	}
	
	
//		using recursive function : A function calling itself 
	public static int factorialUsingRecursion(int number) {
		if(number == 0)
		{
			return 1;
		}else {
			return number*factorialUsingRecursion(number-1);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(findFactorial(5) + " is the factorial of 5");
		System.out.println(findFactorial(0) + " is the factorial of 0");
		System.out.println(findFactorial(1) + " is the factorial of 1");
//		System.out.println(factorialUsingRecursion(10) + " is the factorial of the number 10");
//		System.out.println(factorialUsingRecursion(0) + " is the factorial of the number 0");
//		System.out.println(factorialUsingRecursion(1) + " is the factorial of the number 1");
	}

}
