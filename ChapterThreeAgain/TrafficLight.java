import java.util.Scanner;
public class TrafficLight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter reading light:");
		String light = input.nextLine().toLowerCase();
				
				
				if(light.equalsIgnoreCase("R")){
				System.out.println("Stop");
				}
	
				if (light.equalsIgnoreCase("Y")){
				System.out.println("Get ready");
				}

				if(light.equalsIgnoreCase("G")){
				System.out.println("Go");
				}
					
				
				
				


	}

}