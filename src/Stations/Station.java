package Stations;

import Passengers.PassengerCreator;

public class Station implements IStation {

    String name;

    public Station(String name) {
        this.name = name;
    }


    public String get_name(){
        return this.name;
    }

}
