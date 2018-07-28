package wzorceProjektoweObserver;

import java.util.ArrayList;
import java.util.List;

public class RunnerDispatcher {

    public static void main(String[] args) {

        Dispatcher dispatcher = new Dispatcher();

        Ambulance ambulance = new Ambulance();
        Journalist journalist = new Journalist();
        CIAAgent ciaAgent = new CIAAgent();

        dispatcher.addObserver(ambulance);
        dispatcher.addObserver(journalist);
        dispatcher.addObserver(ciaAgent);

        dispatcher.accidentHappened();
    }
}
