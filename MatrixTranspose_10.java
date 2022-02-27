package internship;

import java.util.Scanner;

public class MatrixTranspose_10{  
	public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter rows:");
	int m=sc.nextInt();
	System.out.println("Enter columns");
	int n=sc.nextInt();
	
	int original[][]=new int[m][n];
	System.out.println("Enter elements:");
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			original[i][j]=sc.nextInt();
		}
	}
	
	    
	
	int transpose[][]=new int[m][n];  
	    
	
	for(int i=0;i<m;i++){    
		for(int j=0;j<n;j++){    
		transpose[i][j]=original[j][i];  
		}    
	}    
	  
	System.out.println("Before transpose:");  
	for(int i=0;i<m;i++){    
		for(int j=0;j<n;j++){    
		System.out.print(original[i][j]+" ");    
		}    
		System.out.println(); 
	}    
	System.out.println("After Transpose:");  
	for(int i=0;i<m;i++){    
		for(int j=0;j<n;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();
	}   
}
}