package ua.artcode.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 19.12.15.
 */
public class SpamSystem implements MyObservable {

    private List<MyObserver> myObservers = new ArrayList<>();

    @Override
    public void addObserver(MyObserver myObserver) {
        myObservers.add(myObserver);
    }

    @Override
    public void removeObserver(MyObserver myObserver) {
        myObservers.remove(myObserver);
    }

    @Override
    public void notifyAllObservers() {
        MyEvent event = new MyEvent("buy best tv in foxtrot");
        for (MyObserver myObserver : myObservers) {
            myObserver.update(event);
        }
    }
}
