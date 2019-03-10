package javaPrograms;

import java.util.Scanner;

public class AbbrevationPrgm {
	
	 static void printInitials(String name) 
	    { 
//	        if (name.length() == 0) 
//	        
//	           return; 
	  
	        // Since touuper() returns int,  
	        // we do typecasting 
	        System.out.print(Character.toUpperCase( 
	            name.charAt(0))); 
	        
	  char arr[] = name.toCharArray();
	        // Traverse rest of the string and  
	        // print the characters after spaces. 
	        for (int i = 1; i < name.length() - 1; i++) 
	            if (name.charAt(i) == ' ') 
	                System.out.print(" " + Character.toUpperCase( 
	                                        name.charAt(i + 1))); 
	        
	        
	        
	    } 
	  
	   
	
	public static void main(String args[])
	{
		        String name = "prabhat kumar singh"; 
		        printInitials(name); 
		    } 
		
	
}
