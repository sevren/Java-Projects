
public class HappyNumbers {
	
	public static void main(String [ ] args)
	{
		
		for(int i=1;i<1001;i++)
		{
			if (isHappy(i))
				System.out.println(i+"is happy");				
		}	
		
	}
	
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
			return getResultRec(n/10,sum);
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
	
