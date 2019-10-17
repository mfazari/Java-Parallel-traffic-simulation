package Stations;

import Stations.Station;

public class London implements Station {

    String name;
    int passengers;

    public London(int passengers){
        name = "London";
        passengers = this.passengers;

    }

    @Override
    public void connect() {

    }
}
