package ua.artcode.design_patterns.observer;

/**
 * Created by serhii on 19.12.15.
 */
public class MyEvent {

    private final String desc;

    public MyEvent(String desc) {
        this.desc = desc;
    }


    public String getDesc() {
        return desc;
    }
}
