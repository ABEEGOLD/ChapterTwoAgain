import java.util.Scanner;
 public class TemperatureValidation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weather temperature: ");
		int tempWeather = input.nextInt();
		
		if(tempWeather >= 30){
		System.out.println("Hot");
		}
		
		if(tempWeather != 15 || tempWeather > 29){
		System.out.println("Nice");
		} 

		if(tempWeather <= 15){
		System.out.println("Cold");
		}

	}
}