package InterviewProgram;

import java.util.Scanner;

public class StringPelindrome 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("it is string pelindrome");
		}
		else
		{
			System.out.println("it is not string pelindrome");
		}
		
		
	}

}
