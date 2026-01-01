package dAY26_mISSED;

public class Assignemnt5_CountNumberofDigits {

	public static void main(String[] args) 
	{
		// Write a Java program to count the number of digits in a given number.
				//Example: 45678 â†’ Output: 5
	   int num=45678;
	   int count=0;
	   while(num>0)
	   {
		   num=num/10; 
		   count++;
	   }
	   System.out.println(count);
	}

}
