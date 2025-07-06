import java.util.Scanner;

public class MultipleAndDoubled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
       int tripled = 3;
       int doubled = 2;
       tripled = tripled * number1;
       doubled = doubled * number2;
System.out.println(tripled + " " + doubled);
//System.out.println(tripled + " " + tripled);

        }

    }

