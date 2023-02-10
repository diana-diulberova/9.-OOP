package Seminar_5.terminal.show;

import Seminar_5.terminal.executable.CommandExecutable;
import Seminar_5.terminal.executable.DeleteStudentByFioExecutable;

public class ShowDeleteStudentByFio implements ShowCommand {
    private final CommandExecutable commandExecutable;

    public ShowDeleteStudentByFio(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void show() {
        if (commandExecutable instanceof DeleteStudentByFioExecutable) {
            System.out.println("Delete students");
        }

    }

}
