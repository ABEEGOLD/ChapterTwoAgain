import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int userNumber = input.nextInt();

	for(int count = 0; count <= 10;count++){
		count++;

		if(count % 2 == 0 ){
		System.out.print("Even!");

		}else{		   
		 System.out.print("Odd!");

		}
		}		
}
}