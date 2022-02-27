package internship;
import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans=0;
      char op;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number: ");
      num1 = sc.nextDouble();
      System.out.println("Enter second number: ");
      num2 = sc.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = sc.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default: System.out.println("Invalid operator...");
      }
      System.out.print("\nResult:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}