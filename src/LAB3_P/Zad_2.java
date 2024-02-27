package LAB3_P;

import java.util.Scanner;
import java.util.ArrayList;

public class Zad_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Enter an integer: ");
            int number = scan.nextInt();

            System.out.println("The divisors of the entered number : " + number + " are " + getDividers(number).toString() + "\nIf you want to continue press [Y] ?");

            char letter = scan.next().charAt(0);
            if ((letter != 'Y') &&  ((letter != 'y'))) {
                System.out.println("The end of the program! ");
                break;
            }
        }
        scan.close();
    }

    static ArrayList<Integer> getDividers(int number) {

        ArrayList<Integer> dividers = new ArrayList<Integer>();

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) dividers.add(i);
        }
        return dividers;
    }

}
