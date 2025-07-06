import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
       double weight = input.nextDouble();
        System.out.print("Enter height in meters: ");
       double height = input.nextDouble();
//       if(weight>1000) {
//           System.out.println(" invalid input");
//       }

       double bmi = weight / (height * height);
       System.out.printf("Your BMI is: %.2f%n:",bmi);

       if(bmi<18.5 || bmi < 24.9){
           System.out.println("Your healthy");
       }else if(bmi<25 || bmi < 29.9){
           System.out.println("Your overweight");
       }else if(bmi<30){
           System.out.println("Your Obesity");
       }else{
           System.out.println("Your situation is bad");
       }
    }
}
