package Paths;

public class Route {

    String from;
    String to;
    int max_speed;

    public Route(String city1, String city2){
        this.from = city1;
        this.to = city2;
        this.max_speed = getSpeed();
    }

    // TODO implement speed function
    public int getSpeed() {
        if()
        return 1;
    }
}
