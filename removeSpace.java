package InterviewProgram;

import java.util.Scanner;

public class removeSpace
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		System.out.println("remove space");
		System.out.println(str.replaceAll(" ", ""));
		
	}

}
