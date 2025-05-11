package InterviewProgram;

import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicate 
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
		
		HashSet hs=new HashSet<>();
		for(int i=0;i<num.length;i++)
		{
			hs.add(num[i]);
		}
		System.out.println("remove duplicate");
		System.out.println(hs);
		
	}

}
