package Seminar_5.terminal.executable;

import Seminar_5.terminal.Command;

public interface CommandExecutableFactory {
    CommandExecutable create (Command command);

    CommandExecutable command(Command parseCommand);
}
