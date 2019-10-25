package Vehicle;

import Paths.Route;

public class Train_3 extends Train {

    // TODO implement train
    int space;
    public int max_speed;
    int current_speed;
    public int commute_time;
    Route route;

    public Train_3(Route route){
        this.space = 300;
        this.max_speed = 100;
        this.route = route;
        this.current_speed = route.getSpeed(max_speed);
        this.commute_time = route.commute_time(current_speed);
    }



}
