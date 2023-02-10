package Seminar_5.terminal;

import java.util.Scanner;

import Seminar_5.terminal.executable.CommandExecutable;
import Seminar_5.terminal.executable.CommandExecutableFactory;
import Seminar_5.terminal.executable.LoggingCommandExecutableFactory;
import Seminar_5.terminal.show.ShowCommandFactory;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null)
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void runReader() {
        Scanner in = new Scanner(System.in);
        while (true) {

            String command = in.nextLine();
            Command parseCommand = commandParser.parseCommand(command);
            // CommandExecutableFactoryImpl commandExecutableFactory = new
            // LogingCommandExecutableFactory(null);
            CommandExecutable commandExecutable = commandExecutableFactory.command(parseCommand);
            commandExecutableFactory.command(parseCommand).execute();
            ShowCommandFactory showCommandFactory = new ShowCommandFactory();
            showCommandFactory.show(parseCommand, commandExecutable).show();
        }
    }
}