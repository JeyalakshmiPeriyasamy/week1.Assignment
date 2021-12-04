package week1.assignments;

public class DuplicateArray {

	 
	 public static void main(String[] args) {
		
		 int arr[] = {10,40,50,20,70,10,50,90,80,40};
		 int j;
		 int i;
		 System.out.println("Duplicated values"+"\n=======================");
		 for(i=0; i<arr.length; i++) {
			 
			 for(j=i+1; j<arr.length; j++) {
				 
				 if(arr[i]==arr[j]) {
					 System.out.println("\n"+arr[i]);
				 }
				 
			 }
		 }
	}
}