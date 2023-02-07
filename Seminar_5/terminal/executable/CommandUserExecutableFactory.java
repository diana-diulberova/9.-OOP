package Seminar_5.terminal.executable;

import Seminar_5.data.User;

public interface CommandUserExecutableFactory  {
    CommandExecutable createCommandExecutable(User user);
}
