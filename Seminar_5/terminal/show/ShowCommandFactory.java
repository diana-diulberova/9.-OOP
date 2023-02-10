package Seminar_5.terminal.show;

import Seminar_5.terminal.Command;
import Seminar_5.terminal.executable.CommandExecutable;
import Seminar_5.terminal.executable.UnknownCommandExecutable;

public class ShowCommandFactory {
    public ShowCommand show(Command command, CommandExecutable commandExecutable) {
        if (command.isCreateCommand()) {
            return new ShowCreateStudent(commandExecutable);
        } else if (command.isDeleteByFioCommand()) {
            return new ShowDeleteStudentByFio(commandExecutable);
        }
        else return new ShowUnknownCommand(commandExecutable);
    }
}
