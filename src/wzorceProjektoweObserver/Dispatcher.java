package wzorceProjektoweObserver;

import java.util.Observable;

public class Dispatcher extends Observable {

    public void accidentHappened() {
        System.out.println("Miał mmiejsce wypadek!");
        setChanged();
        notifyObservers("Wypadek!"); // wywołuje update na liście odbiorców
    }

}
