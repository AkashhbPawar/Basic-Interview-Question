package InterviewProgram;

import java.util.Scanner;

public class GCDofTwoNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int num1=sc.nextInt();
		System.out.println("enter the number2");
		int num2=sc.nextInt();
		int gcd=0;
		
		System.out.println("GCD of two number");
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
		
		
	}

}
