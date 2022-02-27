package internship;

import java.util.Scanner;

public class Minnor_Inverse_8 {
	static boolean isMirrorInverse(int arr[]) 
	{ 
	    for (int i = 0; i < arr.length; i++) 
	    { 
	        
	        if (arr[arr[i]] != i) 
	            return false; 
	    } 
	    
	    return true; 
	}

	 public static void main(String args[]) 
	    {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no of elements:");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 
		 System.out.println("Enter elements:");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		
		 if(isMirrorInverse(arr)) {
			 System.out.println("Yes");
		 }
		 else {
			 System.out.println("No");
		 }
	   
	    }
	
}
