// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.*;

public class Exercise12 {
  public static void main(String[] args) {
  // Write your code here
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number: ");
  double a = sc.nextDouble();
  System.out.println("Enter the second number: ");
  double b = sc.nextDouble();
  System.out.println("Enter the third number: ");
  double c = sc.nextDouble();
  
  double avg = (a+b+c)/3 ;
  
  System.out.println(avg);

 }
}