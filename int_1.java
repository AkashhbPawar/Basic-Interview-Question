package InterviewProgram;

import java.util.Scanner;

public class int_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int [size];
		
		System.out.println("enter the number");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		int[] frequency=new int[size];
		
		for(int i=0;i<num.length;i++)
		{
			frequency[i]=repetation(num, num[i]);	
		}
		
		int quary=sc.nextInt();
		for(int i=0;i<quary;i++)
		{
			int ip=sc.nextInt();
			System.out.println(sumOfOccurance(num, frequency, ip));
		}
		
	
	}
	
	public static int repetation(int arr[],int element)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int sumOfOccurance(int arr[],int frequency[],int ip)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(frequency[i]>=ip/10 && frequency[i]<=ip%10)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	

}
