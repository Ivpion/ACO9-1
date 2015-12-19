package ua.artcode.design_patterns.observer;

/**
 * Created by serhii on 19.12.15.
 */
public class PhoneAccount implements MyObserver {

    @Override
    public void update(MyEvent event) {
        System.out.println("open message box, read spam message " + event.getDesc());
    }
}
