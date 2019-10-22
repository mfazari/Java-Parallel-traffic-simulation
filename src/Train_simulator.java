import Paths.Route;
import Stations.Station;
import Vehicle.Train;
import Vehicle.Train_1;

public class Train_simulator {

    public static void simulate(){

        // Stations
        Station London = new Station("London", rand.nextInt(1000));
        Station Birmingham = new Station("Birmingham", rand.nextInt(600));

        // Routes
        Route London_Birmingham = new Route(London, Birmingham, true, 120);
        Route Birmingham_London = new Route(Birmingham, London, false, 120);

        // Simulation
        Train_1 train = new Train_1(London_Birmingham);
        Train



    }


}
