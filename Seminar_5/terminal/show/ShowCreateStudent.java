package Seminar_5.terminal.show;

import Seminar_5.terminal.executable.CommandExecutable;
import Seminar_5.terminal.executable.CreateStudentExecutable;

public class ShowCreateStudent implements ShowCommand {

    private final CommandExecutable commandExecutable;

    public ShowCreateStudent(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void show() {
        if (commandExecutable instanceof CreateStudentExecutable) {
            System.out.println("Add student");
        }
    }

}
