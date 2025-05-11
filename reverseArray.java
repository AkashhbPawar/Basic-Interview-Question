package InterviewProgram;

import java.util.Scanner;

public class reverseArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		
		System.out.println("enter the number");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		System.out.println("reverse array");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(num[i]+" ");
		}
	}

}
