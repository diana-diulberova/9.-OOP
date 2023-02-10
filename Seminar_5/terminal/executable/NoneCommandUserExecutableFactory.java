package Seminar_5.terminal.executable;

import Seminar_5.dto.User;

public class NoneCommandUserExecutableFactory implements CommandUserExecutableFactory{
    @Override
    public CommandExecutable createCommandExecutable(User user) {
        return new NoneCommandExecutable();
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        // TODO Auto-generated method stub
        return null;
    }
}