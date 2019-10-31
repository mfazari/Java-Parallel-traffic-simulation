package Vehicle;

import Paths.Route;
import Stations.Station;

public class Train {

    int max_seats;
    public int max_speed;
    int current_speed;
    public int commute_time;
    Route route;
    String name;

    public Train(){
        this.name = name;
    }


    // Get From Station
    public String getfromStation() {
        Station temp = route.get_from_Station();
        return temp.get_name();
    }

    // Get to Station
    public String gettoStation() {
        Station temp = route.get_to_Station();
        return temp.get_name();
    }

    public String get_name(){
        return this.name;
    }

    public int max_seat_number(){
        return this.max_seats;
    }

}
