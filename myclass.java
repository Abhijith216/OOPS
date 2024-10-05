import java.util.*;
public class myclass
{
	public static void main(String args[])
	{
		try
		{
			int num[]={1,2,3};
			System.out.println("error");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("try and catch executed successfully");
		}
	}
}
