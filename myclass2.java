import java.util.*;
public class myclass2
{
	public static void main(String args[])
	{
		try
		{
			int[] num={1,2,3};
			System.out.println("Num[10]");
		}
		catch(Exception e)
		{
			System.out.println("Error occured in pgm");
		}
		finally
		{
			System.out.println("Try and catch executed successfully");
		}
	}
}
