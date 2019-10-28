package Stations;

import Passengers.PassengerCreator;

public class Station implements IStation {

    String name;
    String[] passengerList;

    public Station(String name) {
        this.name = name;
        this.passengerList = getPassengers(this.name);
    }


    public String[] getPassengers(String name) {
        PassengerCreator example = new PassengerCreator(name);
        return example.createPassengers();
    }

}
