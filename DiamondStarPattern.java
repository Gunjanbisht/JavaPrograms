package javaPrograms;

public class DiamondStarPattern {
	
	public static void main (String args[])
	{
		int i=0,j=0,k=0;
		for(i=1;i<=10;i++)
		{
			for(k=10-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			}
		    for(i=1;i<10;i++)
		    { 
			    for(k=1;k<=i;k++)
			     {
				    System.out.print(" ");
			     }
			for(j=1;j<10*2-i-k;j++)
			{
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
