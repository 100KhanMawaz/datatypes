package conditionalStatement;

public class IfELSEIf {
	
	public static void main(String[] args)  {
		
		int number = 28;
		
	   if(number <=10) {
		   
		   System.out.print("number is less than 10");
		   
	   } else if(number > 10 && number <=20) {
		   
		   System.out.print("nmber is greater than 10 less than 20");
		   
	   } else if (number >= 20 && number <=30)  {
		   
		   System.out.print("number is greater than 20 but less than 30");
		   
	   } else {
		   
		   System.out.print("number is greater than 30");
		   
	   }
		
	}

}
