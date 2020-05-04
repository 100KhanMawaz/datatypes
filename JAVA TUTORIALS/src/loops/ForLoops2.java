package loops;

import java.util.Scanner;

public class ForLoops2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// factorial
		
		
		int n = sc.nextInt();
	
		int result = 1;
		
		for(int i = n; i >= 1; i--) {
			
	 result = result * i;
	 
			
		}
		 System.out.println(result);


	}

}
