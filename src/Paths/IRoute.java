package Paths;

public interface IRoute {
    int getSpeed(int max_speed_train);
    int commute_time(int speed);
    int passengernumber();
}
