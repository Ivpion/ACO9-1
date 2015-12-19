package ua.artcode.design_patterns.observer;

/**
 * Created by serhii on 19.12.15.
 */
public class Test {


    public static void main(String[] args) {
        SpamSystem mailSpamSystem = new SpamSystem();

        mailSpamSystem.addObserver(new Address());
        mailSpamSystem.addObserver(new MailAccount());
        mailSpamSystem.addObserver(new PhoneAccount());

        mailSpamSystem.notifyAllObservers();


    }
}
