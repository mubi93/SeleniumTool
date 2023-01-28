import java.util.Scanner;

import org.apache.commons.collections4.iterators.ReverseListIterator;
public class Palindrome 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int rev=10;
		{
			if(num==rev)
			{
				System.out.println("the given no is palindrome");
			}
			else
			System.out.println("the given no is not  palindrome");
			
		}
		
		
	}
}
