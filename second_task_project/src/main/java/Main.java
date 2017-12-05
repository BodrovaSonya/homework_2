import java.util.Scanner;

/**
 * Created by sonya on 03.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 to call the calculator or 2 to call the procedure for finding the max word length in the array");
        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();
        switch (decision){
            case 1:
                Calc calc = new Calc();
                calc.calculate();
                break;
            case 2:
                Array array = new Array();
                System.out.println(array.maxLengthWord());
                break;
        }
    }

}
