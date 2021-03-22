// 5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125

import java.util.*;

public class Exercise05 {
  public static void main(String[] args) {
  // Write your code here
  
  Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
  System.out.print("Enter first number: ");
  int a= sc.nextInt();
  
  System.out.print("Enter second number: ");
  int b= sc.nextInt();
  
  int mult=a*b;
  
  System.out.println(mult);

 }
}