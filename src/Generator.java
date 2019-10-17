import Stations.London;

public class Generator {

    public static void Generator(){
        London London = new London(1000);
        London Manchester = new London("Manchester", 100);
        London Birmingham = new London("Birmingham", 500);
        London Leeds = new London("Leeds", 300);
        London Liverpool = new London("Liverpool",400);
    }


}
