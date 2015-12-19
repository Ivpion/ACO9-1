package ua.artcode.design_patterns.observer;

/**
 * Created by serhii on 19.12.15.
 */
public interface MyObservable {

    void addObserver(MyObserver myObserver);
    void removeObserver(MyObserver myObserver);
    void notifyAllObservers();

}
