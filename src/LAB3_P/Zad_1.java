package LAB3_P;

import java.util.Scanner;
import java.util.ArrayList;

public class Zad_1 {
    public static void main(String[] args) {
        ArrayList<Integer> evens = new ArrayList<Integer>(); //parzyste
        ArrayList<Integer> odds = new ArrayList<Integer>(); //nie parzyste
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an integer: ");

            int number = scan.nextInt();

            if (number == 0) break;

            System.out.println("Whether the enter number: " + number + " " + "Is prime :" + isPrime(number));

            String str = Integer.toString(number);

            for (int i = 0; i<str.length(); i++){
               if (isEven(Integer.parseInt(String.valueOf(str.charAt(i))))) evens.add(i);
                else odds.add(i);
            }
            double averageEvens = calculateAverage(evens);
            double averageOdds = calculateAverage(odds);

            System.out.println("Division of odds to evens is: " + averageOdds / averageEvens + "\nIf you want to continue press [Y]");
            evens.clear();
            odds.clear();

            char letter = scan.next().charAt(0);
            if ((letter != 'Y') && ((letter != 'y'))) {
                System.out.println("The end of the program! ");
                break;
            }
        }
        scan.close();
    }

    static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) return false;
        }
        return true;
    }

    static boolean isEven(int number) {

        if (number % 2 == 0) return true;

        return false;
    }

    static double calculateAverage(ArrayList<Integer> numbers) {

        double average = 0;

        for (int number : numbers) {
            average = average + number;
        }
        return average / numbers.size();
    }
}