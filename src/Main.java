

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       Generator generator = new Generator();
       // Random seed
       generator.start(4);
    }

    static void randomGenerator(long seed) {
        Random generator = new Random(seed);
        double num = generator.nextInt(1000);
        System.out.println((num));
        num = generator.nextInt(500);
        System.out.println((num));
    }
}
