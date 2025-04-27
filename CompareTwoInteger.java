package BasicPrograms;

public class CompareTwoInteger {

	public static void main(String[] args) {
		
//		Due to Integer caching it gives equal for equal values(through Autoboxing) between number range -128 to 127
//		Integer num1 = 100;	// gives equal output
//		Integer num2 = 100;
		
		Integer num1 = 190;	//	gives not equal as 190 is not within -128 to 127
		Integer num2 = 190;
		
		if(num1 == num2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
	}

}
