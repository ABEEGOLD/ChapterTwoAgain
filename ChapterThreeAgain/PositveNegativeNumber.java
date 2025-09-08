import java.util.Scanner;
public class PositveNegativeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();

		if(number > 0){
		System.out.println("Positive");
		}
		
		if(number <= 0){
		System.out.println("Negative");
		}

	}
}