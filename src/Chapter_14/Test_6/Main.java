package Chapter_14.Test_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        MyTest myTest = (userInput) -> (userInput >= 10 && userInput <=20) ? true : false;
        System.out.println(myTest.testing(input));
    }
}
