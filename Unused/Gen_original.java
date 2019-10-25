import Paths.Route;
import Stations.*;

import java.util.Random;

public class Generator {

    public static void start(int seed){



        // Generate Stations with random passenger number using a deterministic seed
        Station London = new Station("London", rand.nextInt(1000));
        Station Manchester = new Station("Manchester", rand.nextInt(500));
        Station Leeds = new Station("Leeds", rand.nextInt(400));
        Station Birmingham = new Station("Birmingham", rand.nextInt(600));
        Station Liverpool = new Station("Liverpool", rand.nextInt(300));

        // Generate Paths
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
