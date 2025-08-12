import java.util.Scanner;
public class PasswordValidator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password:");
		String password = input.nextLine();
	
	if(!password.equalsIgnoreCase("secret123")){
	 	 System.out.println("Access denied!");
	}
	if(password.equalsIgnoreCase("secret123")){
		System.out.println("Access granted! Welcome!"); 
	} 
	
}

}	