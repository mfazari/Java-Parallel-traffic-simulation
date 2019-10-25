
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
       Generator generator = new Generator();
       // Random seed
       generator.simulate(4);
       Generator_Beta generator2 = new Generator_Beta(4);
       generator2.simulate();
    }
    
}
