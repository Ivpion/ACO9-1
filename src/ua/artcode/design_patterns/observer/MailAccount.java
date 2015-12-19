package ua.artcode.design_patterns.observer;

/**
 * Created by serhii on 19.12.15.
 */
public class MailAccount implements MyObserver {

    @Override
    public void update(MyEvent event) {
        System.out.println("add mail to spam list");
    }
}
