
public class ExceptionArray
{
	public static void main(String args[])
	{
      		try
		{
			int num[]={5,8,12,10,3};
			for(int i=0;i<=6;i++)
			{
				System.out.println(num[6]);
			}
   		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("There are max 5 numbers in the array. You can't go outside the max limit");
		}	
	}

}