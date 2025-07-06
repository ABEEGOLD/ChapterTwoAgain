import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
       int squareFirst =firstNumber * firstNumber;
        int squareSecond  = secondNumber * secondNumber;

       System.out.println("The squares of:" + squareFirst);
        System.out.println("The squares of:" + squareSecond);
        int sum = squareFirst + squareSecond;
        System.out.println("The sum is:" + sum);
          int difference = squareFirst - squareSecond;
            System.out.print("The difference is:" +difference);



    }
}
