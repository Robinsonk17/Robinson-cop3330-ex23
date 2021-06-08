package oop.exercises;
import java.util.Scanner;

public class Main {
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
              if (choice.equals("N")) {
                System.out.print("Does the car make a slicking noise? ");
                choice = input.next();
                if (choice.equals("Y")) {
                    System.out.println("Replace the battery.");
                } else if (choice.equals("N")) {
                    System.out.print("Does the car crank up but fail to start?");
                    choice = input.next();
                    if (choice.equals("Y")) {
                        System.out.println("Check spark plug connections.");
                    } else if (choice.equals("N")) {
                        System.out.print("Does your car have fuel injection?");
                        choice = input.next();
                        if (choice.equals("Y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                        choice = input.next();
                        if (choice.equals("N")) {
                            System.out.println("This should not be possible");
                        }
                    }
                }

            }

        }
    }
}
