package InterviewProgram;

import java.util.Scanner;

public class binaryNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		System.out.println("binary number");
		while(num>0)
		{
			int rem=num%2;
			System.out.print(rem);
			num=num/2;
		}
		
	}

}
