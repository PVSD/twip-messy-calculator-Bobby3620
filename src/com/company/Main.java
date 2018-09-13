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


        //If user chooses add

            if (kbOption.equals("add")) {
                System.out.println("Please enter a number");
                int a = (int) kbInput.nextDouble();
                System.out.println("Please enter another number");
                int b = (int) kbInput.nextDouble();
                int ab = a + b;
                int togetherAdd = (int) Math.sqrt(ab);
                System.out.println("This is your answer: " + togetherAdd + "." + " Are you satisfied?");
                String kbYes = kbOnce.nextLine();
                System.out.println("You selected: " + kbYes.toLowerCase());

                //If user is happy
                if (kbYes.equals("yes")) {
                    System.out.println("Cool");
                } else {
                    System.out.println("Can you guess the operation performed?");
                    String sqrt = kbTwice.nextLine();
                    System.out.println("You chose: " + sqrt.toLowerCase());

                    //Where the user selects the operation
                    if (sqrt.equals("square root")) {
                        System.out.println("Correct! Goodbye");
                    } else {
                        System.out.println("Try again");

                    }
                }
            }


            //If user chooses subtract
            else if (kbOption.equals("subtract")) {
                System.out.println("Please enter a number");
                int a = (int) kbInput.nextDouble();
                System.out.println("Please enter another number");
                int b = (int) kbInput.nextDouble();
                int ab = a - b;
                int togetherSubtract = Math.abs(ab);
                System.out.println("This is your answer: " + togetherSubtract + "." + " Are you satisfied?");
                String kbYes = kbOnce.nextLine();
                System.out.println("You selected: " + kbYes.toLowerCase());

                //If user is happy
                if (kbYes.equals("yes")) {
                    System.out.println("Cool");
                } else {
                    System.out.println("Can you guess the operation performed?");
                    String abs = kbTwice.nextLine();
                    System.out.println("You choose: " + abs.toLowerCase());

                    //Where the user selects the operation
                    if (abs.equals("absolute")) {
                        System.out.println("Correct! Goodbye");
                    } else {
                        System.out.println("Try again");

                    }
                }
            }


            //If user chooses multiply
            else if (kbOption.equals("multiply")) {
                System.out.println("Please enter a number");
                int a = (int) kbInput.nextDouble();
                System.out.println("Please enter another number");
                int b = (int) kbInput.nextDouble();
                int togetherMultiply = (int) Math.pow(a, b);
                System.out.println("This is your answer: " + togetherMultiply + "." + " Are you satisfied?");
                String kbYes = kbOnce.nextLine();
                System.out.println("You selected: " + kbYes.toLowerCase());

                //If user is happy
                if (kbYes.equals("yes")) {
                    System.out.println("Cool");
                } else {
                    System.out.println("Can you guess the operation performed?");
                    String pow = kbTwice.nextLine();
                    System.out.println("You choose: " + pow.toLowerCase());

                    //Where the user selects the operation
                    if (pow.equals("power")) {
                        System.out.println("Correct! Goodbye");
                    } else {
                        System.out.println("Try again");

                    }
                }
            }


            //If user chooses divide
            else if (kbOption.equals("divide")) {
                System.out.println("Please enter a number");
                int a = (int) kbInput.nextDouble();
                System.out.println("Please enter another number");
                int b = (int) kbInput.nextDouble();
                int ab = a / b;
                int togetherDivide = (int) Math.acos(ab);
                System.out.println("This is your answer: " + togetherDivide + "." + " Are you satisfied?");
                String kbYes = kbOnce.nextLine();
                System.out.println("You selected: " + kbYes.toLowerCase());

                //If user is happy
                if (kbYes.equals("yes")) {
                    System.out.println("Cool");
                } else {
                    System.out.println("Can you guess the operation performed?");
                    String arcos = kbTwice.nextLine();
                    System.out.println("You choose: " + arcos.toLowerCase());

                    //Where the user selects the operation
                    if (arcos.equals("arcos")) {
                        System.out.println("Correct! Goodbye");
                    } else {
                        System.out.println("Try again");

                    }
                }
            } else {
                //for loop -> says you're stupid 10x
                for (int count = 1; count <= 10; count++) {
                    String stupid = "You're stupid";
                    System.out.println(stupid.toUpperCase());

                    //allows the user to try again
                    if (count == 10) {
                        System.out.println("Retry");
                    }
                }
            }
        }
    }
