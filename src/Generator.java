import Paths.Route;
import Stations.*;

import java.util.Random;

public class Generator {

    public static void start(int seed){

        // We use Random with seed
        Random rand = new Random(seed);

        // Generate Stations with random passenger number using a deterministic seed
        London London = new London(rand.nextInt(1000));
        Manchester Manchester = new Manchester(rand.nextInt(500));
        Leeds Leeds = new Leeds(rand.nextInt(400));
        Birmingham Birmingham = new Birmingham(rand.nextInt(600));
        Liverpool Liverpool = new Liverpool(rand.nextInt(300));

        // TODO Generate Paths
        Route London_Birmingham = new Route(London, Birmingham);
        Route Birmingham_Manchester = new Route(Birmingham, Manchester);
        Route Birmingham_Liverpool = new Route(Birmingham, Liverpool);
        Route Manchester_Liverpool = new Route(Manchester, Liverpool);
        Route Manchester_Leeds = new Route(Manchester, Leeds);
    }


}
