package javaPrograms;

public class NumberPattern {

	public static void main(String args[])
	{
		int i,j,k,l;
		for(i=1;i<5;i++)
		{
			for(k=5-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++)
			{
				for(l=j;l<=j;l++)
				{	
				System.out.print(l);
				}
			}
			
			System.out.println();
		}
		
		
	}
	
}
