import java.util.Scanner;
public class FavoriteNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
				
		int count;
		 int favoriteNumber = 7;
		 int userGuess;
		while(count != 0){
		System.out.print("Enter guess:");
		userGuess = input.nextInt();
		}

		if(userGuess.equalsIgnoreCase(favouritNumber)){
		System.out.print("That’s my favorite number!");	
		}else{
			System.out.print("Nice try, guess again!");
 
		}

				
	}

}