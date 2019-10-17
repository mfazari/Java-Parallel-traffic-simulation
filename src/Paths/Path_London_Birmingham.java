package Paths;

import java.nio.file.Paths;

public class Path_London_Birmingham implements Path_original {

    String from;
    String to;
    int max_speed;

    public Path_London_Birmingham(String city1, String city2){
        this.from = city1;
        this.to = city2;
        this.max_speed = getSpeed();
    }

    @Override
    public int getSpeed() {
        return 1;
    }
}
