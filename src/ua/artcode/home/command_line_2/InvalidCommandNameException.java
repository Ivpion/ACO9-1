package ua.artcode.home.command_line_2;

import ua.artcode.week5.day1.exception.ExceptionIntro;

/**
 * Created by serhii on 17.12.15.
 */
public class InvalidCommandNameException extends Exception {
    public InvalidCommandNameException(String s) {
        super(s);
    }
}
