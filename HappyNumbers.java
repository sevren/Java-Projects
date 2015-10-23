
public class HappyNumbers {
	
	public static void main(String [ ] args)
	{
		//
		for(int i=1;i<1001;i++)
		{
			if (isHappy(i))
				System.out.println(i+" is happy");				
		}	
		
	}
	
	/**
	 * This function checks if the number is happy, uses a trick to speed up execution since we don't explicitly have to check for a cycle (thanks wikipedia!)
	 * Another way to detect cycles is to use a set as they do not allow duplicate numbers and just insert when testing the sum, but then the issue is that you have to keep a extra collection variable and refer to it as well as
	 * Handle those exceptions.. exception handling is not fun.
	 * @param num
	 * @return
	 */
	public static boolean isHappy(int num)
	{ 
		
		int sum=num;
		
		while (sum!=1)
		{
			if (sum==4) //since we know a cycle includes 4 why not just exit immediately?
			{
				return false;
			}
			sum=getSumOfSquares(sum,0); // calc the sum
		}
		
		return true;
	}

/**
 * Magical function that gets the sum of the squares.
 * Any number sent in will use modulo to split the digits in the number .. so 49 mod 10 gives 9.. and subsequently dividing that number by 10 will give the next digit
 * Another way to do this would be using Java's string and then split + parse but it is a naive way of doing it.
 * @param n
 * @param sum
 * @return the final sum
 */
private static int getSumOfSquares(int n,int sum) {
		
		int extractedDigit=0;
		
		if (n>0)
		{
			extractedDigit=n%10;
			sum+=extractedDigit*extractedDigit;
			return getSumOfSquares(n/10,sum);
		}
		return sum;
		
	}
	
	private static int getResult(int n) {
		
		int lastdig=0;
		
		int sum=0;
		while (n >0)
		{
			lastdig=n%10;
			sum+=lastdig*lastdig;
			n=n/10;
		}
		return sum;
	}

	private static int getLength(int number)
	{
		if (number==0)
		{
			System.out.println(1);
			return 1;
		}
		else
		{
			System.out.println((int)Math.log10(Math.abs(number)) + 1);
			return  (int)Math.log10(Math.abs(number)) + 1;
		}
	}
}
	
