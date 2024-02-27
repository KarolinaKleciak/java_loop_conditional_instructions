package LAB3_P;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Zad_dodatkowe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> rand_number = new ArrayList<>();
        Random rand = new Random();


        while(true){

            int upperbound = 6;
            int lower_bound = 1;
            int rand_int = (int)(rand.nextInt(upperbound - lower_bound) + lower_bound);

            rand_number.add(rand_int);
            if(rand_int == 5){
                System.out.println("The number 5 was drawn!");
                break;
            }
        }
        System.out.println(rand_number.toString());
        System.out.println("The multiplication of the entered number is: " + resulttMultiplication(rand_number) );
    }


    static double resulttMultiplication(ArrayList<Integer> numbers){

        double result_of_multiplication = 1;

        for (int number: numbers) {

            result_of_multiplication = result_of_multiplication * number;
        }
        return result_of_multiplication;
    }
}


