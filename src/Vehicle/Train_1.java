package Vehicle;

import Paths.Route;

public class Train_1 extends Train {

    int max_seats;
    public int max_speed;
    int current_speed;
    public int commute_time;
    Route route;

    public Train_1(Route route){
        this.max_seats = 400;
        this.max_speed = 120;
        this.route = route;
        this.current_speed = route.getSpeed(max_speed);
        this.commute_time = route.commute_time(current_speed);
    }

    // TODO implement this function
    public void change_Station(){
    }



}
