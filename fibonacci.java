package gitHomeWork;

import java.util.Arrays;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fibonacci = new int[10];
		
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i=2; i<=(fibonacci.length -1); i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			System.out.println(i+" th element is "+fibonacci[i]);
		}
		
		System.out.println("Fibonacci array is: "+ Arrays.toString(fibonacci));
		
		
	}

}
