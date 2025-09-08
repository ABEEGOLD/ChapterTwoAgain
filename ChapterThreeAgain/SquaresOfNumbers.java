import java.util.Scanner;
public class SquaresOfNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter firstNumber: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter secondNumber: ");
		int secondNumber = input.nextInt();
		System.out.print("Enter thirdNumber: ");
		int thirdNumber = input.nextInt();
		System.out.print("Enter fourthNumber: ");
		int fourthNumber = input.nextInt();
		System.out.print("Enter fifthNumber: ");
		int fifthNumber = input.nextInt();
		
		firstNumber = firstNumber * firstNumber;
		secondNumber = secondNumber * secondNumber;
		thirdNumber = thirdNumber * thirdNumber;
		fourthNumber = fourthNumber * fourthNumber;
		fifthNumber = fifthNumber * fifthNumber;
	
		System.out.println("first squared is:" +firstNumber);
		System.out.println("first squared is:" +secondNumber);
		System.out.println("first squared is:" +thirdNumber);
                System.out.println("first squared is:" +fourthNumber);
		System.out.println("first squared is:" +fifthNumber);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

	}
}