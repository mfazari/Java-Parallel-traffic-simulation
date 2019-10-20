package Paths;

import Stations.Station;

public class Route {

    Station from;
    Station to;
    int max_speed;

    public Route(Station city1, Station city2){
        this.from = city1;
        this.to = city2;
        this.max_speed = getSpeed();
    }

    // TODO implement speed function
    public int getSpeed() {
        return 0;
    }
}
