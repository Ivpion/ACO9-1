package ua.artcode.home.command_line;

import java.io.File;
import java.util.Scanner;

/**
 * Created by serhii on 13.12.15.
 */
public class View {


    private Scanner sc = new Scanner(System.in);
    private CommandLineController commandLineController;

    public View(CommandLineController commandLineController) {
        this.commandLineController = commandLineController;
    }

    public void start() {

        while (true) {

            System.out.print(commandLineController.getStartLine());

            String command = sc.nextLine();

            String res = commandLineController.executeCommand(command);

            System.out.println(res);

            if(res.equals("exit")){
                break;
            }
        }

    }


}
