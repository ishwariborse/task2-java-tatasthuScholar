package internship;

import java.util.Scanner;

public class PNC_5 {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static int factorial(int n) {
       
        int fact = 1;
       
        for (int i = 1; i <= n; i++) {
        
            fact = fact * i;
        }
        
        return fact;
    }

    public static void main(String args[]) {
        int n, r;
        Scanner sc = new Scanner(System.in);

        println("Enter the value of n : ");
        n = sc.nextInt();

        println("Enter the value of r : ");
        r = sc.nextInt();

        int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));

        int npr = (factorial(n) / (factorial(n - r)));

        println("nPr is : " + npr);
        println("\nnCr is : " + ncr);
    }

}