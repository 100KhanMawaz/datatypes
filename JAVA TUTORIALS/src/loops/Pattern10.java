package loops;


import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int j = n; j >= 1; j--) {
			for(int i = 1; i <= n-j; i++) {
				System.out.print("    ");
			}
		for(int i = 1; i<=j; i++ ) {
			System.out.print("* ");
		 //anuj bhaiya se puchna padgea lagta h
			// net pr search kiya h ni mila kch sol
			
			} System.out.println();
		
		}	
	}
}