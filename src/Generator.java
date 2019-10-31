import Paths.Route;
import Stations.Station;
import Vehicle.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Generator extends Thread {

    // Stations
    Station London;
    Station Birmingham;
    Station Manchester;
    Station Leeds;
    Station Liverpool;

    // Routes
    Route London_Birmingham;
    Route Birmingham_Manchester;
    Route Birmingham_Liverpool;
    Route Manchester_Liverpool;
    Route Manchester_Leeds;

    public Generator(int seed) {
        // Stations
        this.London = new Station("London");
        this.Birmingham = new Station("Birmingham");
        this.Manchester = new Station("Manchester");
        this.Leeds = new Station("Leeds");
        this.Liverpool = new Station("Liverpool");

        //Routes
        this.London_Birmingham = new Route(London, Birmingham, true, 120);
        this.Birmingham_Manchester = new Route(Birmingham, Manchester, false, 120);
        this.Birmingham_Liverpool = new Route(Birmingham, Liverpool, false, 120);
        this.Manchester_Liverpool = new Route(Manchester, Liverpool, false, 100);
        this.Manchester_Leeds = new Route(Manchester, Leeds, false, 100);

    }

    Thread thread1 = new Thread() {
        public void run() {
            Train_1 train1 = new Train_1(London_Birmingham);
            int commute_time_A = train1.commute_time;
            try {
                go(commute_time_A, train1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Thread thread2 = new Thread() {
        public void run() {
            Train_2 train2 = new Train_2(Birmingham_Manchester);
            int commute_time_B = train2.commute_time;
            try {
                go(commute_time_B, "Train 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Thread thread3 = new Thread() {
        public void run() {
            Train_3 train3 = new Train_3(Birmingham_Liverpool);
            int commute_time_C = train3.commute_time;
            try {
                go(commute_time_C, "Train 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Thread thread4 = new Thread() {
        public void run() {
            Train_4 train4 = new Train_4(Manchester_Liverpool);
            int commute_time_D = train4.commute_time;
            try {
                go(commute_time_D, "Train 4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Thread thread5 = new Thread() {
        public void run() {
            Train_5 train5 = new Train_5(Manchester_Leeds);
            int commute_time_E = train5.commute_time;
            try {
                go(commute_time_E, "Train 5");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };


    public static void go(int time, Train train) throws InterruptedException {
        String[] list = createPassengers(train.getfromStation());
        System.out.println(train.get_name() + " has left the station...");
        TimeUnit.SECONDS.sleep(time);

        //train returns after waiting for 5 seconds
        TimeUnit.SECONDS.sleep(5);
        System.out.println(train.get_name() + " has reached the station and goes back...");
        back(time, train);

    }

    public static void back(int time, Train train) throws InterruptedException {
        String[] list = createPassengers(train.gettoStation());
        TimeUnit.SECONDS.sleep(time);

        //train returns after waiting for 5 seconds
        TimeUnit.SECONDS.sleep(5);
        System.out.println(train.get_name() + " has arrived back...");
        go(time, train);
    }

    public void simulate() {
        System.out.println("Simulation is starting...");
        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
        this.thread4.start();
        this.thread5.start();
    }

    public static String[] createPassengers(String station_Name) {
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

}
