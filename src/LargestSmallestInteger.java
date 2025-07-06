import java.util.Scanner;

public class LargestSmallestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int inputFirst = input.nextInt();
        System.out.print("Enter second number: ");
        int inputSecond = input.nextInt();
        System.out.print("Enter third number: ");
        int inputThird = input.nextInt();
        System.out.print("Enter fourth number: ");
        int inputFourth = input.nextInt();
        System.out.print("Enter fifth number: ");
        int inputFifth = input.nextInt();

        int smallest = inputFirst;
        if(inputSecond < smallest){
            smallest = inputSecond;
        }
        if(inputThird < smallest){
            smallest = inputThird;
        }
        if(inputFourth < smallest){
            smallest = inputFourth;
        }
        if(inputFifth < smallest){
            smallest = inputFifth;
        }

        int largest = inputFirst;
        if(inputSecond > largest){
            largest = smallest;
        }
        if(inputThird > largest){
            largest = inputThird;
        }
        if(inputFourth > largest){
            largest = inputFourth;
        }
        if(inputFifth > largest){
            largest = inputFifth;
        }
        System.out.printf("The smallest number is: %d%n", smallest);
        System.out.printf("The largest number is: %d%n", largest);
    }
}
