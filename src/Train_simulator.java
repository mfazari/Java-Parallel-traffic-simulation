import Paths.Route;
import Stations.Station;
import Vehicle.Train;
import Vehicle.Train_1;

import java.util.concurrent.TimeUnit;

public class Train_simulator {

    public static void simulate() throws InterruptedException {

        // Stations
        Station London = new Station("London", rand.nextInt(1000));
        Station Birmingham = new Station("Birmingham", rand.nextInt(600));

        // Routes
        Route London_Birmingham = new Route(London, Birmingham, true, 120);
        Route Birmingham_London = new Route(Birmingham, London, false, 120);

        // Simulation
        Train_1 train = new Train_1(London_Birmingham);
        int commute_time = train.commute_time;
        go(commute_time);

    }

    public static void go(int time) throws InterruptedException {

        TimeUnit.SECONDS.sleep(time);

        //train returns after waiting for 5 seconds
        TimeUnit.SECONDS.sleep(5);
        back(time);

    }

    public static void back(int time) throws InterruptedException {
        TimeUnit.SECONDS.sleep(time);

        //train returns after waiting for 5 seconds
        TimeUnit.SECONDS.sleep(5);
        go(time);
    }

}
