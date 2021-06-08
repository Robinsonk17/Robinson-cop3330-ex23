package oop.exercises;
import java.util.Scanner;

public class Main
{
    public class Solution {
        public static void main(String[] args) {
            String choice;
            Scanner input;

            input = new Scanner(System.in);

            System.out.print("Is the car silent when you turn the key (Y or N)? ");
            choice = input.next();

            if (choice.equals("Y")) {
                System.out.print("Are the battery terminals corroded? ");
                choice = input.next();

                if (choice.equals("Y")) {
                    System.out.println("Clean terminals and try starting again.");
                } else {
                    System.out.println("Replace cables and try again.");
                }
            } else {
                System.out.println("No issues.");
            }
        }
    }

}
