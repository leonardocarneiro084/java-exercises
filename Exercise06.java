// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to // the editor
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5


import java.util.*;

public class Exercise06 {
  public static void main(String[] args) {
  // Write your code here
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first number: ");
  int a = sc.nextInt();
  
  System.out.println("Enter second number: ");
  int b = sc.nextInt();
  
  int sum = a+b;
  int sub = a-b;
  int mult = a*b;
  int div = a/b;
  int rem = a%b;
  
  System.out.println(a+ " + " +b+ " = " + sum);
  System.out.println(a+ " - " +b+ " = " + sub);
  System.out.println(a+ " x " +b+ " = " + mult);
  System.out.println(a+ " / " +b+ " = " + div);
  System.out.println(a+ " mod " +b+ " = " + rem);
 }
}