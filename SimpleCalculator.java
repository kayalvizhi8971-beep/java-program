import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation: +  -  *  / %");
        char operator = sc.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println("Result =" + result);
                
            case '%':
                 result= num1 % num2;
                   System.out.println("Result=" + result);
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}