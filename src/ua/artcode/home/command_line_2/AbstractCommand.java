package ua.artcode.home.command_line_2;

import java.util.List;

/**
 * Created by serhii on 16.12.15.
 */
public abstract class AbstractCommand implements ICommand {

    protected final String name;
    protected final List<String> options;

    public AbstractCommand(String name, List<String> options) {
        this.name = name;
        this.options = options;
    }


}
