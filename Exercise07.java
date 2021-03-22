// 7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80


import java.util.*;

public class Exercise07 {
  public static void main(String[] args) {
  // Write your code here
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number for multiplication table: ");
  int a = sc.nextInt();
  
  for ( int i = 1; i <=10 ; i++ ) {
    int mult = a*i;
    System.out.println(a+ " X " +i+ " = " +mult);
  }
 }
}