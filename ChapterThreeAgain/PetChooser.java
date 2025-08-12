import java.util.Scanner;
public class PetChooser{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter pet name:");
		String pet = input.nextLine().toLowerCase();
				
		
		if(pet == "Doy or cat"){
		System.out.println("Woof!  Dogs are awesome!");
		}

		if(pet == "others"){
		System.out.println("Cool choice, but I love dogs!"); 
		}

	}

}