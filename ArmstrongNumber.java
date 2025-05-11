package InterviewProgram;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		int temp=num;
		int temp1=temp;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+isfact(count,rem);
			temp=temp/10;
		}
		System.out.println(sum);
		if(temp1==sum)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
		
	}
	
	public static int isfact(int count,int rem)
	{
		int fact=1;
		for(int i=1;i<=count;i++)
		{
			fact=fact*rem;
		}
		return fact;
	}


}
