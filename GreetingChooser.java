import java.util.Scanner;
public class GreetingChooser{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = input.nextLine().toLowerCase();
		
		if(name.equalsIgnoreCase("Alex")){
		System.out.print("Hello, friend!");
	
		}else{
			System.out.print("Hi, Stranger!");

		}



}


}