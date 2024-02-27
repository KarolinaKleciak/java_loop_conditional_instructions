package LAB3_P;

import java.util.ArrayList;
import java.util.Random;


public class Zad_4 {
    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        Random rand = new Random();

        while (true) {
            int upperbound = 10;
            int lower_bound = 0;
            int random_int = (int) (rand.nextInt(upperbound - lower_bound) + lower_bound);

            randomNumbers.add(random_int);
            if (random_int == 5) {
                System.out.println("The number 5 was drawn !");
                break;
            }
        }
        double sum_multiplication = 1;

        System.out.println(randomNumbers.toString());
        for (int numb_rand : randomNumbers) {
            sum_multiplication = sum_multiplication * numb_rand;
        }
        System.out.println("\nMultiplication of the numbers are: " + sum_multiplication);}
}
