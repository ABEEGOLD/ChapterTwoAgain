import java.util.Scanner;

public class DiameterCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circumference: ");
        double radius = input.nextDouble();
        radius = radius * 3.14159;
       double diameter = 2 * radius;
       double circumference = diameter * 3.14159 * radius;
       double area = 3.14159 * radius * radius;

       System.out.println("the radius is %n: " + radius + " and the diameter is %n: " + diameter + " and the circumference is %f%n: " + circumference + " and the area %f%n is: " + area);

       System.out.println("The radius of the circle is: " + radius);
       System.out.println("The diameter of the circle is: " + diameter);
       System.out.printf("The circumference circle %f%n is: ", circumference);
       System.out.printf("The area of the circle is: %f%n", area);



    }
}
