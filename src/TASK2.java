import java.util.InputMismatchException;
import java.util.Scanner;

public class TASK2 {

    // function to add two numbers
    public void Addition(double num1, double num2){
        double sum = 0;
        sum = num1 + num2;
        System.out.println("Result: "+sum);
    }

    //function to subtract one num from another
    public void Subtraction(double num1, double num2){
        double difference = 0;
        difference = num1 - num2;
        System.out.println("Result: "+difference);
    }

    //function to multiply two numbers
    public void Multiplication(double num1, double num2){
        double product = 0;
        product = num1 * num2;
        System.out.println("Result: "+product);
    }

    //function to divide two numbers
    public void Division(double num1, double num2){
        if (num2 == 0 || num2 == 0.0) {      // condition to ensure no division done by zero
            System.out.println("Cannot divide a number by zero");
        }
        else {
            double divide = 0;
            divide = num1 / num2;
            System.out.println("Result: "+divide);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        TASK2 obj = new TASK2();
        //infinite menu display until user wants to exit
        for (;;){
            System.out.println("<------------------------------>");
            System.out.println("Select the operation you want to perform:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("<------------------------------>");

            //try catch exception handling to ensure only numbers are entered
            try {
                if (scan.hasNextInt()) {
                    option = scan.nextInt();
                } else {
                    System.out.println("Invalid Input. Please enter an Integer.");
                    // Clear the scanner buffer
                    scan.next();
                    continue;
                }
            }
            catch (InputMismatchException e){
                    System.out.println("Invalid Input. Please enter an Integer.");
                    // Clear the scanner buffer
                    scan.next();
                    continue;
            }

            // option selection for performing calculations
            if (option == 1){
                try {
                    double num1, num2;
                    System.out.println("Enter First number:");
                    num1 = scan.nextDouble();
                    System.out.println("Enter Second number:");
                    num2 = scan.nextDouble();
                    obj.Addition(num1,num2);
                }
                catch (Exception e){
                    System.out.println("Invalid Input. Please enter an Number");
                }
            }
            else if (option == 2){
                try {
                    double num1, num2;
                    System.out.println("Enter First number:");
                    num1 = scan.nextDouble();
                    System.out.println("Enter Second number:");
                    num2 = scan.nextDouble();
                    obj.Subtraction(num1, num2);
                }
                catch (Exception e){
                    System.out.println("Invalid Input. Please enter an Number");
                }
            }
            else if (option == 3){
                try {
                    double num1, num2;
                    System.out.println("Enter First number:");
                    num1 = scan.nextDouble();
                    System.out.println("Enter Second number:");
                    num2 = scan.nextDouble();
                    obj.Multiplication(num1, num2);
                }
                catch (Exception e){
                    System.out.println("Invalid Input. Please enter an Number");
                }
            }
            else if (option == 4){
                try {
                    double num1, num2;
                    System.out.println("Enter First number:");
                    num1 = scan.nextDouble();
                    System.out.println("Enter Second number:");
                    num2 = scan.nextDouble();
                    obj.Division(num1, num2);
                }
                catch (Exception e){
                    System.out.println("Invalid Input. Please enter an Number");
                }
            }
            else if (option == 5){
                break;
            }
            else {
                System.out.println("Invalid Input!");
            }
        }
    }
}