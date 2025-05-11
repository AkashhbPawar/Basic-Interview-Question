package InterviewProgram;

import java.util.Scanner;

public class integerPelindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("it is pelindrome number");
		}
		else
		{
			System.out.println("it is not pelindrome number");
		}
	}

}
