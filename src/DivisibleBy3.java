import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int number = input.nextInt();
      if(number%3==0){
          System.out.println("The number is divisible by 3!");
      }else{
          System.out.println("The number is divisible by 3!");
        }
    }
}
