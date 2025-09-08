import java.util.Scanner;
public class TrafficLighten{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter road light: ");
		String trafficLight = input.nextLine().toLowerCase();
	

		if(trafficLight.equalsIgnoreCase("red")){
			System.out.println("Stop!!");
		}
		
		if(trafficLight.equalsIgnoreCase("green")){
			System.out.println("Go!!");
		}
		
		if(trafficLight.equalsIgnoreCase("yellow")){
			System.out.println("Wait!!");
		}









	}



}