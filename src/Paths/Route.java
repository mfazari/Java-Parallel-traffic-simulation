package Paths;

import Stations.Station;

public class Route {

    Station from;
    Station to;
    boolean overtake; // ability to overtake a train
    int speed;

    public Route(Station city1, Station city2, boolean overtake, int speed){
        this.from = city1;
        this.to = city2;
        this.overtake = overtake;
        this.speed = speed;
    }

    // TODO implement speed function
    public int getSpeed(int max_speed_train) {
        int result = 100;
        if(max_speed_train >= speed){
            result = speed;
            return speed;
        }
        else if(speed > max_speed_train){
            result = max_speed_train;
        }
        return result;
    }
}
