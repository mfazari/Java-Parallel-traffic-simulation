package Paths;

import Stations.Station;

public class Route {

    Station from;
    Station to;
    boolean overtake; // ability to overtake a train

    public Route(Station city1, Station city2, boolean overtake, int speed){
        this.from = city1;
        this.to = city2;
        this.overtake = overtake;
        this.speed = speed;
    }

    // TODO implement speed function
    public int getSpeed() {

        return 0;
    }
}
