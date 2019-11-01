package Stations;

public class Station implements IStation {

    String name;

    public Station(String name) {
        this.name = name;
    }


    public String get_Station_name() {
        return this.name;
    }

}
