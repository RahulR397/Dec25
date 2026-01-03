package dAY26_mISSED;

public class EvenANDoddDigitsInaNumber {

	public static void main(String[] args)
	{
		int num=24879;
		int even=0;
		int odd=0;
		while(num>0)
		{
			int rem=num%10;
			if (rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
		}
			System.out.println("Even number is"  + even);
			System.out.println("Odd number is"  + odd);
			
		}

	}

