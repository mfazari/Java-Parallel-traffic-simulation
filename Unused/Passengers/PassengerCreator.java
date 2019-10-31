package Passengers;

import Stations.Station;

import java.util.Random;

public class PassengerCreator implements IPassengerCreator {

    // TODO Make sense of this class
    String Station_Name;

    public PassengerCreator(String Station_Name) {
        this.Station_Name = Station_Name;

    }

    // TODO implement function that creates Array with Random Passengers

    @Override
    public String[] createPassengers(String station_Name) {
        Random rand = new Random();
        int low = 100;
        int high = 1000;
        int result = rand.nextInt(high - low) + low;

        String[] list = new String[result];

        for (int i = 0; i < list.length; i++) {
            int number = rand.nextInt();
            if (station_Name.equals("London")) {
                if (rand.nextInt() % 2 == 0) {
                    list[i] = "Birmingham";
                } else {
                }
            } else if (station_Name.equals("Birmingham")) {
                if (rand.nextInt() % 2 == 0) {
                    list[i] = "London";
                } else if (rand.nextInt() % 3 == 0) {
                    list[i] = "Manchester";
                } else {
                    list[i] = "Liverpool";
                }
            } else if (station_Name.equals("Manchester")) {
                if (rand.nextInt() % 2 == 0) {
                    list[i] = "Birmingham";
                } else if (rand.nextInt() % 3 == 0) {
                    list[i] = "Leeds";
                } else {
                    list[i] = "Liverpool";
                }
            } else if (station_Name.equals("Leeds")) {
                if (rand.nextInt() % 2 == 0) {
                    list[i] = "Manchester";
                } else {
                }
            } else if (station_Name.equals("Liverpool")) {
                if (rand.nextInt() % 2 == 0) {
                    list[i] = "Birmingham";
                } else {
                    list[i] = "Manchester";
                }
            }

        }
        return list;


    }

    /*
     public String[] getPassengers(String name) {
        PassengerCreator example = new PassengerCreator(name);
        return example.createPassengers();
    }
     */

}
