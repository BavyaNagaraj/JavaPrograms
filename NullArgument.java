package BasicPrograms;

public class NullArgument {
	
//		Pass Null argument with method overloading with String and object types

	public static void main(String[] args) {
		arguments(null);
	}
	
//		When there is String method and Object method, the compiler chooses String method because it is the 
//		obvious data type in the hierarchy between Object and String.... 
	public static void arguments(String str ) {
		System.out.println("String Argument");
	}
	
	public static void arguments(Object obj) {
		System.out.println("Object Argument");
	}
	
//		The compiler throws error(compile time) because there is no hierarchy between String and StringBuffer
//		String can be used instead of StringBuffer or StringBuffer instead of String
//	public static void arguments(StringBuffer strBuffer) {
//		System.out.println("String Buffer");
//	}

}
