package week1.assignments;

public class CharOccurence {

	public static void main(String[] args) {
		String someString = "JeEyalakshmi";
		someString=someString.toLowerCase();
		char someChar = 'e';
		int count = 0;
		 
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		if(count>0) {
			System.out.println("Character\t"+someChar+"\toccures\t"+count);
		}else {
			System.out.println("There is no occurence of character\t"+someChar);
		}
	}
}
