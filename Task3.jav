import java.util.Scanner;
public class Task3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int averageScore = 0;

		for(int index = 0;index < 10;index++){
			index++;
			
			System.out.print("Enter  ten number : ");
			int score = input.nextInt();
			
			sum += score;
			averageScore = sum / 10;

			}
			System.out.println("The number sum is:" +sum);
			Systm.out.println("The number average is:"+averageScore);


	}


}