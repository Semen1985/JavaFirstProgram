import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getInt();
        double num2 = getInt();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    public static double getInt() {
        System.out.println("Input number:");
        double num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();

        } else {
            System.out.println("You did mistake! Try one more time))).");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Input operation:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You did mistake! Try one more time))).");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Something wrong! ( Try one more time.");
                result = calc(num1, num2, getOperation());
            }
        }
        return result;
    }



    public static double calc2(int num1, int num2, char operation)
    {
        int res = 0;

        if (operation == '+') {
            res = num1 + num2;

        }
        else if (operation == '-') {
            res = num1 - num2;

        }
        else if (operation == '*') {
            res = num1 * num2;

        }

        else if (operation == '/') {
            res = num1 / num2;
        }

        System.out.println("Your answer is - " + res);
        return res;
    }
}



