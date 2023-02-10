package Seminar_5.terminal.show;

import Seminar_5.terminal.executable.CommandExecutable;
import Seminar_5.terminal.executable.UnknownCommandExecutable;

public class ShowUnknownCommand implements ShowCommand {
    private final CommandExecutable commandExecutable;

    public ShowUnknownCommand(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void show() {
        if (commandExecutable instanceof UnknownCommandExecutable) {
            System.out.println("Unknown command");
        }
    }
}