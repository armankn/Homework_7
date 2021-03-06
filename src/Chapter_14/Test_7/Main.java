package Chapter_14.Test_7;

import Exercise_2.NumericTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        NumericFunc inputFactorial = (userIn) -> {
            int factorial = 1;
            int i = 1;
            while (userIn > 0 && i <= input) {
                factorial *= i;
                i++;
            }
            return factorial;
        };
        System.out.println(inputFactorial.func(input));
    }
}
