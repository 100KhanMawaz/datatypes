package operators;

public class BitwisOperators {

	public static void main(String[] args) {
	
		
		int a = 10;
		int b = 13;
		
		int c =b>>1;
		
		System.out.println("Right Shift"   +   c);
		
		int d = a&b;
		
		int e = a | b;
		
		System.out.println("and" + d);
		
		System.out.println("or" + e);
		
		int f = a%b;  
				
		System.out.println(f);		
		
	}

}
