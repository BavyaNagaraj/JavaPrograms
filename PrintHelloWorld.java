package BasicPrograms;

public class PrintHelloWorld {
	
//	Print 'Hello World' without using semicolon

	public static void main(String[] args) {
		
//		1. Using printf
		if(System.out.printf("Hello World" + "\n") == null){
		};
		
//		2. Using append
		if(System.out.append("Hello World" + "\n") == null) {
		}
		
//		3. Using append and equals
		if(System.out.append("Hello World").equals(null)) {
		}
		
	}
}