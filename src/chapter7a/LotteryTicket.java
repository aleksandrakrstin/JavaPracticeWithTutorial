package chapter7a;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6; //Constant - field that does not change. Caps lock - convention
    //final is a keyword that is optional
    //to avoid magic numbers below in the code

    private static final int MAX_TICKET_NUMBER = 69; //To avoid magic numbers

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        printTicket(ticket);

    }
    // Create a new method, it's going to return a lottery ticket (an array)
    // int[] - we declared a data type
    //generateNumbers is the name of the method
    public static int[] generateNumbers() {

        //create a new array
        int[] ticket = new int [LENGTH];

        //to randomly generate numbers to assign on the ticket
        //not hard coding numbers
        //this allows us to randomly generate values of various different data types
        Random random = new Random();

        //for repetition, better to use a Loop
        for(int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1; //this will create numbers 0-68, that's why +1
        }
        return ticket; //after this go to main method, to receive ticket
    }  //example of setting elements

    public static void printTicket(int ticket[]) {
        //example of getting elements
        //ticket is a parameter to the method

        //print them with a Loop instead of printing line by line
        for(int i = 0; i < LENGTH; i++) {
            //using print instead of println, so that numbers get printed in 1 line
            //instead of printing 1 number in each line
            System.out.print(ticket[i] + " | ");
        }


    }
}
