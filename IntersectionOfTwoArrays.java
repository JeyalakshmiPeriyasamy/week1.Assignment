package week1.assignments;


public class IntersectionOfTwoArrays {

	public static void main(String args[]) {
	      int myArray1[] = {23, 36, 96, 78, 55,12};
	      int myArray2[] = {78, 45, 19, 73, 56,36};
	      System.out.println("Intersection of the two arrays\n=====================================");
	     
	      for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.println(myArray2[j]);
	            }
	         }
	      }
	   }
}
