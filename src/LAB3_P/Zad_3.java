package LAB3_P;

import java.util.Scanner;
import java.util.Random;

public class Zad_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();


        while (true) {
            int random_int = (rand.nextInt(199) +1);

            System.out.println(random_int);
            while (true) {
                System.out.println("Enter the drawn number: ");

                double number_draw = scan.nextDouble();


                if (number_draw < random_int) System.out.println("The number provided is too small !");
                else if (number_draw > random_int) System.out.println("The number provide is too high !");
                else {
                    System.out.println("Nice shot ! The given number is equal to the one drawn " + number_draw + "\nIf you want to continue press [Y] ?");
                    break;
                }
            }
            char letter = scan.next().charAt(0);
            if ((letter != 'Y') &&  ((letter != 'y'))) {
                System.out.println("The end of the program! ");
                break;
            }
        }
        scan.close();
    }
}