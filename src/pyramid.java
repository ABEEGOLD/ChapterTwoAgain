import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of stones used: ");
        int numberOfStones = input.nextInt();
        System.out.print("Enter average weight of each stone: ");
        double averageWeightPerStone = input.nextDouble();
        System.out.print("Enter number of years to build the pyramid: ");
        int numberOfYears = input.nextInt();

        double totalPyramidWeight = averageWeightPerStone * numberOfStones;
        double weightOfStonePerYear = totalPyramidWeight / numberOfYears;

        int numberOfHoursPerYear = 24 * 365;

        double numberBuiltPerHour = weightOfStonePerYear / numberOfHoursPerYear;
        int numberOfMinutesPerHour = (int) weightOfStonePerYear / 60;

System.out.println("weight of pyramid per year: " +weightOfStonePerYear);
System.out.println("weight of pyramid per hour: " + numberBuiltPerHour);
System.out.println("weight of pyramid per minute: " + numberOfMinutesPerHour);

    }

}
