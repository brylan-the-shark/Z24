// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Calculator");
    System.out.println("Addition - a");
    System.out.println("Subtraction - s");
    System.out.println("Division - d");
    System.out.println("Multiplication - m");

    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();

    switch (choice) {
      case "a": {
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("The sum is: " + (firstNumber + secondNumber));
        break;
      }
      case "s": {
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("The difference is: " + (firstNumber - secondNumber));
        break;
      }
      case "d": {
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("The quotient is: " + (firstNumber / secondNumber));
        break;
      }
      case "m": {
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("The product is: " + (firstNumber * secondNumber));
        break;
      }
    }
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}