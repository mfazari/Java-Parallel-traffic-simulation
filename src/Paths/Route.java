package Paths;

import Stations.Station;

public class Route implements IRoute {

    Station from;
    Station to;
    boolean overtake; // ability to overtake a train
    int speed;
    int length;

    public Route(Station city1, Station city2, boolean overtake, int speed) {
        this.from = city1;
        this.to = city2;
        this.overtake = overtake;
        this.speed = speed;
    }

    @Override
    public int getSpeed(int max_speed_train) {
        int result = 100;
        if (max_speed_train >= speed) {
            result = speed;
            return speed;
        } else if (speed > max_speed_train) {
            result = max_speed_train;
        }
        return result;
    }

    @Override
    public int commute_time(int current_speed) {
        int wait = 5;
        int time = 5 + this.length / current_speed;
        return time;
    }


    public Station get_to_Station(){
        return this.to;
    }

    public Station get_from_Station(){
        return this.from;
    }


}
