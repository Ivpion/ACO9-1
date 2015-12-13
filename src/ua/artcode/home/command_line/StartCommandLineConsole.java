package ua.artcode.home.command_line;

/**
 * Created by serhii on 13.12.15.
 */
public class StartCommandLineConsole {

    public static void main(String[] args) {
        new View(new CommandLineController()).start();
    }
}
