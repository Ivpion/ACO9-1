package ua.artcode.home.command_line_2;

/**
 * Created by serhii on 17.12.15.
 */
public class CommandValidator {
    public static void validAndRaise(String strCommand) throws InvalidCommandNameException {
        if(!CommandFactory.COMMAND_NAMES_CONTAINER.contains(strCommand)){
            throw new InvalidCommandNameException("command " + strCommand + " was not recognized");
        } // todo finish logic of validation
    }
}
