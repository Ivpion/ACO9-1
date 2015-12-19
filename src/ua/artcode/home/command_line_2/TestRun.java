package ua.artcode.home.command_line_2;

/**
 * Created by serhii on 17.12.15.
 */
public class TestRun {

    public static void main(String[] args) {
        CommandDecorator commandDecorator = CommandFactory.create("ls");
        commandDecorator.run("unnecessary arg");
    }
}
