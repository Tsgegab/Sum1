import java.util.InputMismatchException;

import java.util.Scanner;

public class Sum1{

  public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        boolean continueInput = true;



      System.out.print("Enter four  integers : ");

         do {

             try {



                int number1 = input.nextInt();

                 int number2 = input.nextInt();

                 int number3 = input.nextInt();

                 int number4 = input.nextInt();

                int sum = number1+number2+number3+number4;

                // Display the result

                System.out.println(

                         "The sum of four number is " + sum);



                 continueInput = false;

                 }

             catch (InputMismatchException ex) {

                 System.out.println("Try again. (" +

                         "Incorrect input: four integer are required)");

                 input.nextLine(); // Discard input

                 }

             } while (continueInput);

              }

          }






