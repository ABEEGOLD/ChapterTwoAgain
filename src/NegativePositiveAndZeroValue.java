import java.util.Scanner;

public class NegativePositiveAndZeroValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter a second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter a third number: ");
        int thirdNumber = input.nextInt();
        System.out.println("Enter a fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.println("Enter a fifth number: ");
        int fifthNumber = input.nextInt();

        int negativeNumber = 0 ;
        int zeroNumber = 0;
        int positiveNumber = 0;

        if(firstNumber > 0)positiveNumber++;
        else if(firstNumber < 0)negativeNumber++;
        else zeroNumber++;

        if(secondNumber > 0 )positiveNumber++;
        else if(secondNumber < 0)negativeNumber++;
        else zeroNumber++;

        if(thirdNumber > 0)positiveNumber++;
        else if(thirdNumber < 0)negativeNumber++;
        else zeroNumber++;

        if(fourthNumber > 0)positiveNumber++;
        else if(fourthNumber < 0)negativeNumber++;
        else zeroNumber++;

        if(fifthNumber > 0)positiveNumber++;
        else if(fifthNumber < 0)negativeNumber++;
        else zeroNumber++;


        System.out.println("The positive number is "+positiveNumber);
        System.out.println("The negative number is "+negativeNumber);
        System.out.println("The zero number is "+zeroNumber);


    }
}
