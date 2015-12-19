package ua.artcode.home.command_line_2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by serhii on 17.12.15.
 */
public class SORT extends AbstractCommand {

    private String order = "a";

    public SORT(String name, List<String> options) {
        super(name, options);
    }

    @Override
    public String execute(String args) {
        String[] lines = args.split("[\n|\\s]");

        Arrays.sort(lines);

        return String.join("\n", lines);
    }
}
