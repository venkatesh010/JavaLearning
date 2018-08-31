package interfaces;

public class Main {
    public static void main(String[] args) {
        Tv tv = new TvImplementation();
        tv.increaseVolume();
        tv.decreaseVolume();
    }

}
