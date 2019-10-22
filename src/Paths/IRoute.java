package Paths;

public interface IRoute {
    // TODO implement speed function
    int getSpeed(int max_speed_train);
    int commute_time(int speed);
}
