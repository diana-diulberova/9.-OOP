package Seminar_5.terminal;

import java.util.ArrayList;

public class Command {
    private static final String ADD = "add";
    private static final String DEL = "del";
    private static final String STUDENT = "stu";
    private final ArrayList<String> commands;
    private final String mainFirstCommand;

    public Command(ArrayList<String> commands) {
        this.mainFirstCommand = commands.get(0);
        this.commands = commands;

    }

    public ArrayList<String> getArguments() {
        return commands;
    }

    public String getMainFirstCommand() {
        return mainFirstCommand;
    }

    public boolean isCreateCommand() {
        return commands.get(0).equals(ADD);
    }

    public boolean isDeleteCommand() {
        return commands.get(0).equals(DEL);
    }
    public boolean isStudentCommand() {
        return commands.size() > 1 && commands.get(1).equals(STUDENT);
    }
    public String getFirstArgument() {
        return commands.get(0);
    }

    public static String getAdd() {
        return ADD;
    }

    public static String getDel() {
        return DEL;
    }

    @Override
    public String toString() {
        return String.join(" ", commands);
    }
}