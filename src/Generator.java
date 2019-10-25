import Paths.Route;
import Stations.Station;
import Vehicle.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Generator {

    // TODO implement simulate
    public static void simulate(int seed) throws InterruptedException {

        // We use Random with seed
        Random rand = new Random(seed);

        // Stations
        Station London = new Station("London", rand.nextInt(1000));
        Station Birmingham = new Station("Birmingham", rand.nextInt(600));
        Station Manchester = new Station("Manchester", rand.nextInt(500));
        Station Leeds = new Station("Leeds", rand.nextInt(400));
        Station Liverpool = new Station("Liverpool", rand.nextInt(300));

        // Routes
        Route London_Birmingham = new Route(London, Birmingham, true, 120);
        Route Birmingham_Manchester = new Route(Birmingham, Manchester, false, 120);
        Route Birmingham_Liverpool = new Route(Birmingham, Liverpool, false, 120);
        Route Manchester_Liverpool = new Route(Manchester, Liverpool, false, 100);
        Route Manchester_Leeds = new Route(Manchester, Leeds, false, 100);

        trains(London_Birmingham, Birmingham_Manchester, Birmingham_Liverpool, Manchester_Liverpool, Manchester_Leeds);

    }

    // TODO Make this function parallel and functioning
    public static void trains(Route London_Birmingham, Route Birmingham_Manchester, Route Birmingham_Liverpool, Route Manchester_Liverpool, Route Manchester_Leeds) throws InterruptedException {
        // Trains
        Train_1 train1 = new Train_1(London_Birmingham);
        int commute_time_A = train1.commute_time;
        go(commute_time_A);

        Train_2 train2 = new Train_2(Birmingham_Manchester);
        int commute_time_B = train2.commute_time;
        go(commute_time_B);

        Train_3 train3 = new Train_3(Birmingham_Liverpool);
        int commute_time_C = train3.commute_time;
        go(commute_time_C);

        Train_4 train4 = new Train_4(Manchester_Liverpool);
        int commute_time_D = train4.commute_time;
        go(commute_time_D);

        Train_5 train5 = new Train_5(Manchester_Leeds);
        int commute_time_E = train5.commute_time;
        go(commute_time_E);

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
