import java.util.Random;

public class Main {


    public static void main(String[] args) {


        System.out.println("__________________________________________");


        double[] arr = new double[10];


        for (int i = 1; i < arr.length; i++) {

            Random rm = new Random();

            double x = rm.nextDouble(0.9999999999999999);

            arr[i] = x;

            System.out.println(arr[i]);

            if ( i % 3 == 0){

                System.out.println("__________________________________________");

            }
        }
            double[] arr2 = new double[9];

            System.out.println("-------------------------------");

            for(int i = 0; i<arr2.length; i++){

                arr2[i] = Math.random();

                System.out.println(arr2[i]);

                if ((i + 1) % 3 == 0) {

                    System.out.println("---------------------------------");

                }
            }
        }
    }