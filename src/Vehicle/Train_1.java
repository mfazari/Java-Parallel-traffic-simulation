package Vehicle;

import Paths.Route;

public class Train_1 extends Train {

    // TODO implement train
    int passenger_number;
    public int max_speed;
    int current_speed;
    int commute_time;
    Route route;

    public Train_1(Route route){
        this.passenger_number = 400;
        this.max_speed = 120;
        this.route = route;
        this.current_speed = route.getSpeed(max_speed);
        this.commute_time = route.commute_time(current_speed);
    }

}
