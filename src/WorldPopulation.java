import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the current world population: ");
        double currentWorldPopulation = input.nextDouble();
        System.out.print("Enter the annual growth rate: ");
        double annualGrowthRate = input.nextDouble();

//      long currentWorldPopulation = 8213269530L;
        annualGrowthRate = 0.836 / 100;
        double estimateGrowthRate = annualGrowthRate / currentWorldPopulation;
        double oneYearGrowthRate = annualGrowthRate * 1;
        double secondYearGrowthRate = annualGrowthRate * 2;
        double thirdYearGrowthRate = annualGrowthRate * 3;
       double fourthYearGrowthRate = annualGrowthRate * 4;
       double fifthYearGrowthRate = annualGrowthRate * 5;


    System.out.println("Estimated growth rate for one year: " + oneYearGrowthRate);
    System.out.println("Estimated growth rate for second year: " + secondYearGrowthRate);
    System.out.println("Estimated growth rate for third year: " + thirdYearGrowthRate);
    System.out.println("Estimated growth rate for fourth year: " + fourthYearGrowthRate);
    System.out.println("Estimated growth rate for fifth year: " + fifthYearGrowthRate);

    }
}
