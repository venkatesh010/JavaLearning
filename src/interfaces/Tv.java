package interfaces;

public interface Tv {
    //Default implementation if not implemented by class
    default void increaseVolume(){
        System.out.println("Volume Increased");
    }

    void decreaseVolume();
}
