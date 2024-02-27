package LAB3_P;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Zad_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> power_of_number = new ArrayList<Integer>();

        int exponent = 0;
        int base = 3;
        int result = 0;

        while (true) {

            System.out.println("Enter the number: ");
            int number = scan.nextInt();

            if (number < 0) {
                System.out.println("Incorrect value !");
            } else {
                while (true) {

                    result = (int) Math.pow(base, exponent);
                    if (result < number) {
                        power_of_number.add(result);
                        exponent++;
                    } else break;
                }
                System.out.println("Result of power operation is:  " + power_of_number.toString());
                break;
            }
        }
    }
}