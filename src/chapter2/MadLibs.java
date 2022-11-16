package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]) {
        // 1. Get a season of the year
        System.out.println("Enter name of a season of the year");
        Scanner scanner = new Scanner(System.in);
        String nameOfSeason = scanner.next();

        // 2. Get a whole number
        System.out.println("Enter number cups you drank during the day");
        int cupOfCoffee = scanner.nextInt();

        // 3. Get an adjective
        System.out.println("Enter an adjective that refers to a day");
        String adjective = scanner.next();

        // 4. Display input results
        System.out.println("On a " + adjective + " " + nameOfSeason  + " day, I drink a minimum of " + cupOfCoffee + " cups of coffee. ");
    }
}