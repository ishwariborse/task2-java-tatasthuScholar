package internship;

import java.io.*;
import java.util.Scanner;

class reverseLetters_7 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
	
		String r="";
		char ch;
	
		System.out.print("Original String: ");
		System.out.println(s);
		
		for (int i=0; i<s.length(); i++)
		{
			ch= s.charAt(i); 
			r= ch+r; 
		}
		System.out.println("Reversed String: "+ r);
		}
}