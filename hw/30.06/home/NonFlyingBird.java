package home;

/**
 * Created by Вождь on 01.07.2017.
 */
public class NonFlyingBird extends Bird {
    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public String toString() {
        return "NonFlyingBird{}";
    }
}
