public class math {

    public static void main(String[] args) {


                double num1 = 10.0; // Az első szám
                double num2 = 5.0;  // A második szám

                double geometricMean = calculateGeometricMean(num1, num2);

                System.out.println("A két szám mértani átlaga: " + geometricMean);
            }

            // Metódus a mértani átlag kiszámítására
            public static double calculateGeometricMean(double a, double b) {
                return Math.sqrt(a * b);
            }
        }

