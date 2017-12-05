import java.util.Scanner;

/**
 * Реализовать базовые операции калькулятора (+,-,/,*)
 */

public class Calc {


    public void calculate () {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Input first number:");
            // first number
            float firstNumber = scanner.nextFloat();

            System.out.println("Input second number:");

            // second number
            float secondNumber = scanner.nextFloat();

            System.out.println("Choose operation (+,-,*,/): ");
            char op = scanner.next().charAt(0);
            switch (op) {
                case '+':
                    //result of sum
                    System.out.printf("Sum: %.4f\n", sum(firstNumber, secondNumber));
                    break;
                case '-':
                    //result of div
                    System.out.printf("Div: %.4f\n", div(firstNumber, secondNumber));
                    break;
                //result of mult
                case '*':
                    System.out.printf("Mult: %.4f\n", mult(firstNumber, secondNumber));
                    break;
                case '/':
                    //reult of quot
                    System.out.printf("Quot: %.4f\n", quotient(firstNumber, secondNumber));
                    break;
                default:
                    //result of sum
                    System.out.printf("Sum: %.4f\n", sum(firstNumber, secondNumber));
                    break;
            }
            System.out.println("Continue? (1/0)");
            int answer = scanner.nextInt();
            switch (answer) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    flag = true;
                    break;
                default:
                    flag = true;
                    break;
            }
        }
    }
    /**
     *
     * @param a the first number of sum
     * @param b the second number of sum
     * @return the result of sum
     */
    private static float sum (float a, float b){
        return a + b;
    }

    /**
     *
     * @param a the decrementable
     * @param b the subtracted
     * @return the difference
     */
    private static float div (float a, float b) {
        return a - b;
    }

    /**
     *
     * @param a the first factor
     * @param b the second factor
     * @return the composition
     */
    private static float mult (float a, float b){
        return a * b;
    }

    /**
     *
     * @param a the dividend
     * @param b the divider
     * @return the quotient
     */
    private static float quotient (float a, float b){
        return a / b;
    }
}
