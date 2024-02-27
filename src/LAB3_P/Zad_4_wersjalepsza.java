package LAB3_P;

import java.util.ArrayList;
import java.util.Random;


//Program dodaje 5 do wykonania mnożenia

public class Zad_4_wersjalepsza {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> random_number = new ArrayList<Integer>();

        while(true){

            int random_int = rand.nextInt(19) + 1;

            random_number.add(random_int);
            if(random_int == 5 ) {
                System.out.println("The number 5 was drawn!");
                break;
            }
        }
        System.out.println(random_number.toString());
        double multiplication_result = calcuateMultipliacon(random_number);
        System.out.println("The multiplication of the entered number is: " + multiplication_result);

    }

    static double calcuateMultipliacon(ArrayList<Integer> numbers){

        double multiplication_result = 1;

        for (int number: numbers) {

            multiplication_result = multiplication_result * number;
        }
        return multiplication_result;
    }

}
