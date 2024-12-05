import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double ans;
        double a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("Enter the first number: ");
            a = input.nextDouble();
            System.out.print("Enter the second number: ");
            b = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
            return;
        }

        try {
            System.out.print("add (+), subtract (-), multiply (*), divide (/) or modulus (%)?: ");
            String arithmetic = input.next();



            if (arithmetic.equals("+") || arithmetic.equals("add")) {
                ans = calc.add(a, b);
                System.out.println(a + arithmetic + b + " = " + ans);
            } else if (arithmetic.equals("-") || arithmetic.equals("subtract")) {
                ans = calc.subtract(a, b);
                System.out.println(a + " " + arithmetic + " " + b + " = " + ans);

            }
            if (arithmetic.equals("*") || arithmetic.equals("multiply")) {
                ans = calc.multiply(a, b);
                System.out.println(a + arithmetic + b + " = " + ans);

            }
            if (arithmetic.equals("/") || arithmetic.equals("divide")) {
                ans = calc.divide(a, b);
                System.out.println(a + arithmetic + b + " = " + ans);

            }
            if (arithmetic.equals("%") || arithmetic.equals("modular") || arithmetic.equals("mod")) {
                ans = calc.modular(a, b);
                System.out.println(a + arithmetic + b + " = " + ans);

            }

        } catch (Exception e) {
            System.out.println("please enter a valid arithmetic operator");
        }
    }

}