package Vehicle;

import Paths.Route;

public class Train_4 extends Train {


    public Train_4(Route route) {
        this.max_seats = 300;
        this.max_speed = 100;
        this.route = route;
        this.current_speed = route.getSpeed(max_speed);
        this.commute_time = route.commute_time(current_speed);
        this.name = "Train_4";

    }


}
