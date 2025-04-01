package BasicPrograms;

public class ArmstrongNumber {
	
//		Given a number --> 153
//		Its digits are separately cubed  --> 1*1*1 = 1; 5*5*5=125; 3*3*3=27
//		then added --> 1+125+27 = 153
//		If the resultant number is equal to the given number then it is an armstrong number --> 153==153. Hence 153 is an armstrong number

	public static void isArmstrongNumber(int number) {
		
		int originalNumber = number;
		int lastDigit;
		int resultantValue = 0;
		
		while(number > 0) {
			lastDigit = number % 10;
			resultantValue = resultantValue + (lastDigit * lastDigit * lastDigit);
			number = number/10;
		}
		
		if(resultantValue == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong Number");
		}
		else {
			System.out.println(originalNumber + " is not an Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
		
		isArmstrongNumber(153);
		isArmstrongNumber(407);
		isArmstrongNumber(25);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		
	}
	
	

}
