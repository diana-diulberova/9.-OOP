package Seminar_5.terminal;

import java.util.Scanner;

import Seminar_5.terminal.executable.Command;
import Seminar_5.terminal.executable.CommandExecutable;
import Seminar_5.terminal.executable.CommandExecutableFactory;
import Seminar_5.terminal.executable.CommandParser;
import Seminar_5.terminal.executable.LoggingCommandExecutableFactory;

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

            LoggingCommandExecutableFactory commandExecutableFactory = new LoggingCommandExecutableFactory();

            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);

            commandExecutable.execute();

        }

    }

}