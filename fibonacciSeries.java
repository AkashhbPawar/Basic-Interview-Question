package InterviewProgram;

import java.util.Scanner;

public class fibonacciSeries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int a=0;
		int b=1;
		
		if(num==1)
		{
			System.out.println(a);
		}
		else if(num==2)
		{
			System.out.println(a+" "+b);
		}
		else
		{
			System.out.println("fibonacci series");
			System.out.print(a+" "+b+" ");
			for(int i=2;i<num;i++)
			{
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
			
		}
		
		
	}

}
