 package conditionalStatement;

public class NestedifElse {

	public static void main(String[] args) {
		
		int a =5, b=11, c= 100;
				int result =0;
				
		if(a>b) {
			if(a>c) {
				result = a;
				
			} else {
				result = c;
			}
		} else {
			if(b>c) {
				result = b;
				
			}else {
				result = c;
			}
		}
System.out.println("largest number is  " + result);
	}

}
