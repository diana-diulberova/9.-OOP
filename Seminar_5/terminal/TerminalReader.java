package Seminar_5.terminal;

import java.util.Scanner;

import Seminar_5.terminal.CommandExecutable;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstans(CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = new CommandParser();
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void getI() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Ввод: ");
            String command = scan.nextLine();
            Command cool = commandParser.parseCommand(command);

            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);

            commandExecutable.execute();

        }

    }

}