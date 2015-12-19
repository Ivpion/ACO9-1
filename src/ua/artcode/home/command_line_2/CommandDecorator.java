package ua.artcode.home.command_line_2;

/**
 * Created by serhii on 17.12.15.
 */
public class CommandDecorator {

    private ICommand command;
    private CommandDecorator nextCommand;

    public CommandDecorator(ICommand command, CommandDecorator nextCommand) {
        this.command = command;
        this.nextCommand = nextCommand;
    }

    // todo find solution to run without in
    public String run(String in){
        // todo
        return nextCommand != null ? nextCommand.run(command.execute(in)) : command.execute(in);
    }
}
