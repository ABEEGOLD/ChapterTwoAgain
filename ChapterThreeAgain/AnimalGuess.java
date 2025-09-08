import java.util.Scanner;
 public class AnimalGuess{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Guess Animal: ");
		String myAnimal = input.nextLine();

		if(!myAnimal.equalsIgnoreCase("Dog")){
		System.out.println("Nope, it’s a dog!");
		}
		if(myAnimal.equalsIgnoreCase("Dog")){
		System.out.println("Correct! It’s a dog!");
		}
		
		
	}
}