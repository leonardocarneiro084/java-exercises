// 11. Write a Java program to print the area and perimeter of a circle. Go to the editor
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586


import java.math.*;
import javax.swing.*;
import java.util.*;

public class Exercise11 {
  public static void main(String[] args) {
  // Write your code here
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the radius of circle: ");
  double r = sc.nextDouble();
  
  double area = Math.pow(r,2) * Math.PI;
  double perimeter = 2 * Math.PI * r;
  
  System.out.println("Pi value: "+ Math.PI);
  System.out.println("Area: "+ area);
  System.out.println("Perimeter: "+ perimeter);
 }
}