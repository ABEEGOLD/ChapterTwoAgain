import java.util.Scanner;
public class AgeValidation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();

		if(age <= 10){
		System.out.println("Welcome to the show!");
		}
		
		if(age > 10){
		System.out.println("Sorry,you're too young!");
		}


	}
}