package wzorceProjektoweObserver;

import java.util.Observable;
import java.util.Observer;

public class Ambulance implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Jadę do wypadku, żeby uratować rannych.");
    }
}
