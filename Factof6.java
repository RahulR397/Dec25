package dAY26_mISSED;

public class Factof6 {

	public static void main(String[] args)
	//Factorial of a Number

//Write a Java program to find the factorial of a given number using a loop.
//Example: 6 â†’ 720

	{
		int num=6;
		int fact=1;
		{
			for (int i=1;i<=num;i++)
			{
				fact=fact*i;
				//=1*1
				//=1*2
				//=1*3
				//=1*4
				//=1*5
				//=1*6
			}
			System.out.println(fact);
		}

	}

}
