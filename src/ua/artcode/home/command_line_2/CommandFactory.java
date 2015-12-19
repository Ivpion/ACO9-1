package ua.artcode.home.command_line_2;

import java.util.*;

/**
 * Created by serhii on 17.12.15.
 */
public class CommandFactory {

    public static final String SPACE_REGEX_SEPARATOR = "\\s*";
    public static final String PIPE_REGEX_SEPARATOR = "\\|";

    public static final Set<String> COMMAND_NAMES_CONTAINER = initCommands();

    private static Set<String> initCommands() {
        Set<String> commands = new HashSet<>();

        commands.add("ls");
        commands.add("grep");
        commands.add("sort");

        return commands;
    }

    public static CommandDecorator create(String strCommand) throws InvalidCommandNameException {

        return buildChain(parse(strCommand));

    }

    public static CommandDecorator buildChain(List<CommandModel> commandModels) {

        /*if (commandModels.isEmpty()) {
            return null;
        }*/

        return new CommandDecorator(COMMAND_CONTAINER.get(commandModels.get(0).name),
                buildChain(commandModels.subList(1, commandModels.size())));

    }

    public static List<CommandModel> parse(String strCommand) throws InvalidCommandNameException {
        List<CommandModel> commandModels = new ArrayList<>();

        String[] commands = strCommand.split(PIPE_REGEX_SEPARATOR);
        for (String command : commands) {
            String processed = command.trim();

            commandModels.add(getCommand(processed));
        }

        return commandModels;
    }

    // todo validate STRING before call this method
    public static CommandModel getCommand(String command) throws InvalidCommandNameException {
        CommandModel commandModel = new CommandModel();

        String[] parts = command.split(SPACE_REGEX_SEPARATOR); // todo split by spaces


        CommandValidator.validAndRaise(parts[0]);

        commandModel.name = parts[0];

        for (int i = 1; i < parts.length; i++) {
            String part = parts[i];
            if (part.startsWith("-")) {
                commandModel.options.add(part);
            } else {
                commandModel.args.add(part);
            }
        }

        return commandModel;
    }


}
