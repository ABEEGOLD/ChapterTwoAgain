import java.util.Scanner;
 public class PrintName{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Guess Animal: ");
		String name = input.nextLine();

		
		for(int count = 1; count <= 3; count++){
	
		System.out.println(name);
		}

	}
}