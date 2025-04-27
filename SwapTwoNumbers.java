package BasicPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SwapTwoNumbers {
	
//		Swap two numbers without using temporary variable

	public static void main(String[] args) {
		List<Integer> afterSwapping = get(100, 200);
		System.out.println(afterSwapping);
	}
	
	public static List<Integer> get(int a, int b){
		
		LinkedList<Integer> originalNumbers = new LinkedList<Integer>();
	    originalNumbers.add(a);
	    originalNumbers.add(b);
	    
	    List<Integer> swappedNumbers = new LinkedList<Integer>();
	    Iterator<Integer> it = originalNumbers.descendingIterator();
	    while(it.hasNext()){
	        swappedNumbers.add(it.next());
	    }
	    
	    return swappedNumbers; 
	}

}
