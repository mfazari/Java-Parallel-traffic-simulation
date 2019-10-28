package Vehicle;

import Paths.Route;

public class Train_4 extends Train {

    int max_seats;
    public int max_speed;
    int current_speed;
    public int commute_time;
    Route route;

    public Train_4(Route route) {
        this.max_seats = 300;
        this.max_speed = 100;
        this.route = route;
        this.current_speed = route.getSpeed(max_speed);
        this.commute_time = route.commute_time(current_speed);
    }


}
