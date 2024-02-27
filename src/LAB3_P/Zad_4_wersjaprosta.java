package LAB3_P;

import java.util.ArrayList;
import java.util.Scanner;


//Program nie dodaje 5 do wykonania działania mnożenia

public class Zad_4_wersjaprosta {
    public static void main(String[] args) {

        ArrayList<Integer> numbers_multiplication = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Enter the number: ");
            int number = scan.nextInt();

            if (number == 5) {
                System.out.println("The number 5 was drawn!");
                break;
            }
            numbers_multiplication.add(number);
        }
            double result_multiplication = multiplication(numbers_multiplication);

            System.out.println("The multiplication of the entered number is: " + result_multiplication );

    }

    static double multiplication(ArrayList<Integer> numbers)
    {
        double multiplication_result = 1;

        for (int number: numbers) {

            multiplication_result = multiplication_result * number;
        }
        return multiplication_result;
    }
}
