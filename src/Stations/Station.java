package Stations;

public class Station implements IStation {

    String name;
    int passengers;

    public Station(String name, int passengers){
        this.name = name;
        this.passengers = passengers;
    }
}
