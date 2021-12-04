package week1.assignments;

public class CheckPositiveOrNegativeNumber {
	public static void main(String[] args) {
			
			int num=-912;  
			if(num>0) {  
				System.out.println("The number is positive.");  
			}  
			else if(num<0)  {  
				System.out.println("The number is negative.");  
				System.out.println("\nConverted into positive and the number is:\t"+Math.abs(num));  
			
			}  
			else{  
				System.out.println("The number is zero.");  
			}  
			
	}

}
