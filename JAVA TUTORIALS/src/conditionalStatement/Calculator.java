package conditionalStatement;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String[] arms) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the pehla number");
		
		int a = sc.nextInt();		
		System.out.println("dusra number");
		
		int b = sc.nextInt();
		
		System.out.println("OPERATION");
		sc.nextLine();
		char OPERATION = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(OPERATION) {
		
		case '+' :
			result = a + b;
			break;
			
		case '-' :
			result = a - b;
			break;
			
		case '*' :
			result = a * b;
			break;
		
		case '/' :
			result = a / b ;
		break;
		default :
			System.out.println(" shi se dal");
		 
		} System.out.println(" ye le  " + result);
		
		
		
	}
	
}
