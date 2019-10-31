package Vehicle;

import Paths.Route;
import Stations.Station;

public class Train_1 extends Train {

    public Train_1(Route route) {
        this.max_seats = 400;
        this.max_speed = 120;
        this.route = route;
        this.current_speed = route.getSpeed(max_speed);
        this.commute_time = route.commute_time(current_speed);
        this.name = "Train_1";
    }

}
