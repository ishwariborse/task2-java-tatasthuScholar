package internship;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_9 {
	 public static void main(String[] args) {  
		 
		 Scanner sc=new Scanner(System.in);
	        

	      ArrayList<String> arr = new ArrayList<String>(10); 
	      
	      int choice;
	      System.out.println("Add strings in arraylist");
	      do {
	    	  System.out.println("Enter String to add:");
	    	  String s=sc.nextLine();
	    	  arr.add(s);
	    	  System.out.println("To continue press 0");
	    	  choice=sc.nextInt();
	    	  sc.nextLine();
	      
	      }while(choice==0);
	   
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }    
	       
	      System.out.println("Enter name to remove from arraylist:");
	      String name=sc.nextLine();
	      arr.remove(name);
	  
	      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
	        
	     
	      for (String s : arr) {  
	         System.out.println("Name is: " + s);  
	      }  
	   }  
	

}
