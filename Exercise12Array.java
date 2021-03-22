
// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
// using arrays

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of elements: ");
        int[] meuArray = new int[sc.nextInt()];
        System.out.println("Array created with " + meuArray.length + " positions.");

        // user enters numbers and stores in array
        for (int i = 0; i < meuArray.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Enter number: ");

            while (sc.hasNextInt()) {
                int x = sc.nextInt();
                meuArray[i]=x;
                break;
            }
        }

        // sum all elements in array
        double total = 0;
        for (int i:meuArray) {
            total+=i;
        }
        System.out.println("Sum of all elements: " + total);

        // calculate and print average
        double avg = total / meuArray.length;
        System.out.println("The average is: " + avg);
    }
}
