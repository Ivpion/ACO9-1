package ua.artcode.design_patterns.observer;

/**
 * Created by serhii on 19.12.15.
 */
public class Address implements MyObserver {
    @Override
    public void update(MyEvent event) {
        System.out.println("drop spam to trash wit content" + event.getDesc());
    }

}
