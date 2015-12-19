package ua.artcode.home.command_line_2;

import java.io.File;
import java.util.List;

/**
 * Created by serhii on 16.12.15.
 */
public class LS extends AbstractCommand {

    public static final String COMMAND_AVAILABLE_OPTIONS = "alt";

    public LS(String name, List<String> options) {
        super(name, options);
    }

    @Override
    public String execute(String args) {
        File dir = new File(args);

        File[] files = dir.listFiles();
        String resultList = "";
        for (File file : files) {
            if (options.contains("a")) {
                resultList += String.format("%s - %s", file.getName(), file.length());
            } else if (!file.getName().startsWith(".")) {
                resultList += String.format("%s", file.getName()) + (options.contains("l") ? "\n" : " ");
            }
        }

        return resultList;
    }
}
