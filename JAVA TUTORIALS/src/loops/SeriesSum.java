    package loops;

 import java.util.Scanner;
 
public class SeriesSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double result = 0;
		
		for(double i = 1; i <= n; i++) {
			
			result = result + 1/i;
			
			
			
		} System.out.println(result);
		
	}

}
