package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Where the scanner is created
        Scanner kbInput = new Scanner(System.in);
        Scanner kbOnce = new Scanner(System.in);
        Scanner kbTwice = new Scanner(System.in);


        //Where the user chooses
        System.out.println("Please choose to either add, subtract, multiply or divide");
        String kbOption = kbInput.nextLine();
        System.out.println("You selected: " + kbOption.toLowerCase());

        //If user choose add
        if(kbOption.equals("add")){
            System.out.println("Please enter a number");
            int a = (int)kbInput.nextDouble();
            System.out.println("Please enter another number");
            int b = (int)kbInput.nextDouble();
            int ab = a + b;
            int togetherAdd = (int)Math.sqrt(ab);
            System.out.println("This is your answer: " + togetherAdd + "." + " Are you satisfied?");
            String kbAdd = kbOnce.nextLine();
            System.out.println("You selected: " + kbAdd.toLowerCase());

            //If user is happy
            if(kbAdd.equals("yes")) {
                System.out.println("Cool");
            }else {
                System.out.println("Can you guess the operation performed?");
                String sqrt = kbTwice.nextLine();
                System.out.println("You choose: " + sqrt.toLowerCase());

                //Where the user selects the operation
                if(sqrt.equals("square root")){
                    System.out.println("Correct! Goodbye");
                }else {
                    System.out.println("Try again");
                }
            }
        }

        //If user choose subtract
        if(kbOption.equals("subtract")){
            System.out.println("Please enter a number");
            int a = (int)kbInput.nextDouble();
            System.out.println("Please enter another number");
            int b = (int)kbInput.nextDouble();
            int ab = a - b;
            int togetherSubtract = Math.abs(ab);
            System.out.println("This is your answer: " + togetherSubtract + "." + " Are you satisfied?");
            String kbSubtract = kbOnce.nextLine();
            System.out.println("You selected: " + kbSubtract.toLowerCase());

            //If user is happy
            if(kbSubtract.equals("yes")) {
                System.out.println("Cool");
            }else {
                System.out.println("Can you guess the operation performed?");
                String abs = kbTwice.nextLine();
                System.out.println("You choose: " + abs.toLowerCase());

                //Where the user selects the operation
                if(abs.equals("absolute")){
                    System.out.println("Correct! Goodbye");
                }else {
                    System.out.println("Try again");
                }
            }
        }

    }
}
