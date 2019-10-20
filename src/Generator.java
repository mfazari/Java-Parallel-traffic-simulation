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
        Route London_Birmingham = new Route(London, Birmingham, true, 120);
        Route Birmingham_London = new Route(Birmingham, London, false, 120);

        Route Birmingham_Manchester = new Route(Birmingham, Manchester, false, 120);
        Route Manchester_Birmingham = new Route(Manchester, Birmingham, false, 120);

        Route Birmingham_Liverpool = new Route(Birmingham, Liverpool, false, 120);
        Route Liverpool_Birmingham = new Route(Liverpool, Birmingham, false, 120);

        Route Manchester_Liverpool = new Route(Manchester, Liverpool, false, 100);
        Route Liverpool_Manchester = new Route(Liverpool, Manchester, false, 100);

        Route Manchester_Leeds = new Route(Manchester, Leeds, false, 100);
        Route Leeds_Manchester = new Route(Leeds, Manchester, false, 100);
    }


}
