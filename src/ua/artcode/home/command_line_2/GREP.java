package ua.artcode.home.command_line_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 17.12.15.
 */
public class GREP extends AbstractCommand {

    private static final String COMMAND_OPTIONS = "r";

    private final String searchWord;

    public GREP(String name, List<String> options, String searchWord) {
        super(name, options);
        this.searchWord = searchWord;
    }

    @Override
    public String execute(String args) {
        String[] lines = args.split("[\n|\\s]");

        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if(line.contains(searchWord)){
                result.add(line);
            }
        }

        return String.join("\n", result);
    }
}
