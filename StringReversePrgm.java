package javaPrograms;

import java.util.Scanner;

public class StringReversePrgm {
	public static void main(String args[])
	{
		String Str,rev = " ";
		int i,len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		Str = sc.nextLine();
		//System.out.println(Str);
		 len = Str.length();
		for(i=len-1;i>=0;i--)
		{
			rev = rev + Str.charAt(i);		
		}
		
		System.out.println(rev);
		
	}

}
