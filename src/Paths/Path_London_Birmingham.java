package Paths;

import java.nio.file.Paths;

public class Path_London_Birmingham implements Path_original {

    String from;
    String to;

    public Path_London_Birmingham(String city1, String city2){
        this.from = city1;
        this.to = city2;
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
