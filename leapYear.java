package InterviewProgram;

import java.util.Scanner;

public class leapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(num%1==0&&num%4==0)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it is not leap year");
		}
		
	}

}
