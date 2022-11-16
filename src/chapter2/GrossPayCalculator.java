package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // 1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in); // To receive input in Java
        int hours = scanner.nextInt(); //defining the type of data int hours, and 2. part is the value

        // 2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate. ");
        double rate = scanner.nextDouble(); //Double is the same as float, but more used
        scanner.close(); //This was the last usage, to free up space

        // 3. Multiply hours and pay rate
        double grossPay = hours * rate; //Class name Capital, variable starts with lower case

        // 4. Display results
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
