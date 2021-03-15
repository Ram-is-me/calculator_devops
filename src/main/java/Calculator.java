import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Scientific Calculator by S RAM (IMT2017521)!");
        boolean loopcondition = true;
        while (loopcondition) {
            loopcondition = false;
            System.out.println("Choose one of the four options below and press Enter:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            String choice;
            Calcops c = new Calcops();
            Scanner input =new Scanner(System.in);
            choice = input.nextLine();
            String temp;
            double answer = 0;
            if (choice.equals("1")) {
                System.out.println("Enter the number to find Square root:");
                temp = input.nextLine();
                answer = c.sqrt(Double.parseDouble(temp));
            } else if (choice.equals("2")) {
                System.out.println("Enter the number to find Factorial:");
                temp = input.nextLine();
                answer = c.factorial(Double.parseDouble(temp));
            } else if (choice.equals("3")) {
                System.out.println("Enter the number to find Natural Logarithm:");
                temp = input.nextLine();
                answer = c.log(Double.parseDouble(temp));
            } else if (choice.equals("4")) {
                System.out.println("Enter the number to find Power :");
                System.out.println("Enter the base:");
                temp = input.nextLine();
                String temp2;
                System.out.println("Enter the exponent:");
                temp2 = input.nextLine();
                answer = c.power(Double.parseDouble(temp), Double.parseDouble(temp2));
            }
            System.out.println("The Answer is :" + answer);
            System.out.println("Do you want to calculate again? [1:yes/0:no]");
            choice = input.nextLine();
            if (choice.equals("1")) {
                loopcondition = true;
            }
        }
        System.out.println("Thank you!");
    }
}
